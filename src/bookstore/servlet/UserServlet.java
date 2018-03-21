package bookstore.servlet;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bookstore.domain.Person;
import bookstore.service.UserService;


/**
 * @author Guozhen_Zhao
 * 创建时间：2018年3月17日  下午2:22:45
 * 备注：
 */
@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

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
	
	//用户登陆页面
	public void loginPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		request.getRequestDispatcher("/WEB-INF/js/xueshengshaodai/index-dI.jsp").forward(request, response);
	}
	
	UserService userService = new UserService();

	//点击登陆链接到首页
	public void indexPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
		HttpSession session = request.getSession();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String ident = request.getParameter("ident");
		session.setAttribute("username", username);
		
		Person person = new Person();
		person.setUserName(username);
		person.setPassWord(password);
		Long i = userService.login(person);
		
		if (i==1) {
			if ("buyer".equals(ident)) {
				request.getRequestDispatcher("/WEB-INF/js/shouye.jsp").forward(request, response);
				return;
			}else if ("seller".equals(ident)) {
				request.getRequestDispatcher("/WEB-INF/js/maijia/index-maijia-first.jsp").forward(request, response);
			}
		}else{
			response.sendRedirect(request.getContextPath()+"/index.jsp");
		}
	}
	
	//点击注册，进入注册页面
	public void registerPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		request.getRequestDispatcher("/WEB-INF/js/xueshengshaodai/zhucebiao.jsp").forward(request, response);
	}
	
	//点击注册链接到首页
	public void index2Page(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String againpassword = request.getParameter("againpassword");
		String string = request.getParameter("ident");
		System.out.println(string);
		String message = "";
		if(username.equals("")){
			message = "用户名不能为空";
		}else if(password.equals("")){
			message = "密码不能为空";
		}else if (!(password.equals(againpassword))) {
			message = "两次密码不一致";
		}else{
			Person person = new Person();
			
			person.setUserName(username);
			person.setPassWord(password);
			Long info = userService.selectCountByUserName(username);
			System.out.println(info);
			if(info == 1){
				message = "账户已存在，注册失败";
			}else if (info == 0) {
				userService.register(person);
			}
		}
		request.setAttribute("message", message);
		if ("".equals(message)) {
			request.getRequestDispatcher("/WEB-INF/js/xueshengshaodai/index-dI.jsp").forward(request, response);
			return;
		}
		request.getRequestDispatcher("/WEB-INF/js/xueshengshaodai/zhucebiao.jsp").forward(request, response);
	}
	
	//完善信息
	public void sellerInfoPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		request.getRequestDispatcher("/WEB-INF/js/maijia/index-maijia-first002.jsp").forward(request, response);
	}

}