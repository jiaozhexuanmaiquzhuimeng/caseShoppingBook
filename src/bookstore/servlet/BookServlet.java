package bookstore.servlet;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import bookstorce.service.AccountService;
import bookstorce.service.BookService;
import bookstorce.service.UserService;
import bookstore.domain.Account;
import bookstore.domain.Book;
import bookstore.domain.ShoppingCart;
import bookstore.domain.ShoppingCartItem;
import bookstore.domain.User;
import bookstore.web.BookStoreWebUtils;
import bookstore.web.CriteriaBook;
import bookstore.web.Page;

@WebServlet("/bookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	private BookService bookService = new BookService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String methodName = request.getParameter("method");

		try {
			Method method = getClass().getDeclaredMethod(methodName, HttpServletRequest.class,
					HttpServletResponse.class);
			//获取私有成员变量
			method.setAccessible(true);
			method.invoke(this, request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
			
		}
	}

	private UserService userService = new UserService();

	//登录结账操作
	protected void cash(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String accountId = request.getParameter("accountId");

		StringBuffer errors = validateFormField(username, accountId);
		
		//判空验证后进行与户名和信用卡账户验证֤
		if(errors.toString().equals("")) {
			errors = validateUser(username, accountId);
			
			//验证库存
			if (errors.toString().equals("")) {
				errors = validateBookStoreNumber(request);
				
				//验证账号余额
				if (errors.toString().equals("")) {
					errors = validateBalance(request,accountId);
				}
			}
		}
		if (!errors.toString().equals("")) {
			request.setAttribute("error", errors);
			request.getRequestDispatcher("/WEB-INF/pages/cash.jsp").forward(request, response);
			return;
		}
		
		//ͨ执行批量操作
		bookService.cash(BookStoreWebUtils.getShoppngCart(request),username,accountId);
		response.sendRedirect(request.getContextPath()+"/success.jsp");
	}
	
	private AccountService accountService = new AccountService();
	//验证账号余额
	public StringBuffer validateBalance(HttpServletRequest request, String accountId) {
		StringBuffer errors = new StringBuffer("");
		ShoppingCart cart = BookStoreWebUtils.getShoppngCart(request);
		
		Account account = accountService.getAccount(Integer.parseInt(accountId));
		if (cart.getTotalMoney() > account.getBalance()) {
			errors.append("余额不足");
		}
		return errors;
	}

	//验证库存
	public StringBuffer validateBookStoreNumber(HttpServletRequest request) {
		StringBuffer errors = new StringBuffer("");
		ShoppingCart cart = BookStoreWebUtils.getShoppngCart(request);
		for(ShoppingCartItem sci :cart.getItems()) {
			int quantity = sci.getQuantity();
			//int storeNumber = sci.getBook().getStoreNumber();
			int storeNumber = bookService.getBook(sci.getBook().getId()).getStoreNumber();
			
			if(quantity>storeNumber) {
				errors.append(sci.getBook().getTitle()+"库存不够<br>");
			}
		}
		return errors;
	}
	
	//验证用户名和信用卡账号
	public StringBuffer validateUser(String username,String accountId) {
		boolean flag = false;

		User user = userService.getUserByUserName(username);
		if (user != null) {
			int accountId2 = user.getAccountId();

			if (accountId.trim().equals("" + accountId2)) {
				flag = true;
			}
		}
		StringBuffer errors2 = new StringBuffer("");
		if (!flag) {
			errors2.append("用户名或者信用卡账户错误");
		}
		return errors2;
	}
	
	//文本框判空验证
	public StringBuffer validateFormField(String username, String accountId) {
		StringBuffer errors = new StringBuffer("");
		if (username == null || username.trim().equals("")) {
			errors.append("用户名不为空");
		}
		if (accountId == null || accountId.trim().equals("")) {
			errors.append("用卡账号不为空");
		}
		return errors;
	}

	protected void updateItemQuantity(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 4.修改购物车中某类图书的数量
		String idStr = request.getParameter("id");
		String quantityStr = request.getParameter("quantity");

		ShoppingCart sc = BookStoreWebUtils.getShoppngCart(request);
		int id = -1;
		int quantity = -1;
		try {
			id = Integer.parseInt(idStr);
			quantity = Integer.parseInt(quantityStr);
		} catch (Exception e) {
		}

		if (id > 0 && quantity > 0)
			bookService.updateItemQuantity(sc, id, quantity);

		// 5.重新封装购物车中的信息
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("bookNumber", sc.getBookNumber());
		result.put("totalMoney", sc.getTotalMoney());
		//序列化解析json
		Gson gson = new Gson();
		String jsonStr = gson.toJson(result);
		response.setContentType("Text/javascript");
		response.getWriter().print(jsonStr);
	}
	
	//清除购物车中某类书籍
	protected void remove(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idStr = request.getParameter("id");

		int id = -1;
		try {
			id = Integer.parseInt(idStr);
		} catch (Exception e) {
		}

		ShoppingCart sc = BookStoreWebUtils.getShoppngCart(request);
		bookService.removeItemFromSHoppingCart(sc, id);
		if (sc.isEmpty()) {
			request.getRequestDispatcher("/WEB-INF/pages/emptycart.jsp").forward(request, response);
			return;
		}

		request.getRequestDispatcher("/WEB-INF/pages/cart.jsp").forward(request, response);
	}

	protected void clear(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ShoppingCart sc = BookStoreWebUtils.getShoppngCart(request);
		bookService.clearSoppingCart(sc);
		request.getRequestDispatcher("/WEB-INF/pages/emptycart.jsp").forward(request, response);
	}

	protected void forwardPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = request.getParameter("page");

		request.getRequestDispatcher("/WEB-INF/pages/" + page + ".jsp").forward(request, response);
	}

	protected void addToCart(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 传入书本的id
		String idStr = request.getParameter("id");
		int id = -1;
		boolean flag = false;

		try {
			id = Integer.parseInt(idStr);
		} catch (Exception e) {
		}

		if (id > 0) {
			// 获取购物车
			ShoppingCart sc = BookStoreWebUtils.getShoppngCart(request);

			// 将获取的图书信息图书放入购物车
			flag = bookService.addToCart(id, sc);
		}

		if (flag) {
			//获取图书按照条件返回
			getBooks(request, response);
			return;
		}
		request.getRequestDispatcher("/WEB-INF/pages/books.jsp").forward(request, response);
	}

	protected void getBooks(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pageNoStr = request.getParameter("pageNo");
		String minPriceStr = request.getParameter("minPrice");
		String maxPriceStr = request.getParameter("maxPrice");

		int pageNo = 1;
		int minPrice = 0;
		int maxPrice = Integer.MAX_VALUE;

		try {
			pageNo = Integer.parseInt(pageNoStr);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			minPrice = Integer.parseInt(minPriceStr);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			maxPrice = Integer.parseInt(maxPriceStr);
		} catch (Exception e) {
			// TODO: handle exception
		}

		CriteriaBook criteriaBook = new CriteriaBook(minPrice, maxPrice, pageNo);

		Page<Book> page = bookService.getPage(criteriaBook);

		request.setAttribute("bookpage", page);

		request.getRequestDispatcher("/WEB-INF/pages/books.jsp").forward(request, response);
	}

	protected void getBook(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idStr = request.getParameter("id");

		int id = -1;

		Book book = null;

		try {
			id = Integer.parseInt(idStr);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (id > 0) {
			book = bookService.getBook(id);
		}
		if (book == null) {
			response.sendRedirect(request.getContextPath() + "/error-1.jsp");
			return;
		}

		request.setAttribute("book", book);

		request.getRequestDispatcher("/WEB-INF/pages/book.jsp").forward(request, response);
	}

}
