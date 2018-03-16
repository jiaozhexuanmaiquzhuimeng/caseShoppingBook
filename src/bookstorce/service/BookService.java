package bookstorce.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

import bookstore.dao.AccountDAO;
import bookstore.dao.BookDAO;
import bookstore.dao.TradeDAO;
import bookstore.dao.TradeItemDAO;
import bookstore.dao.UserDAO;
import bookstore.domain.Book;
import bookstore.domain.ShoppingCart;
import bookstore.domain.ShoppingCartItem;
import bookstore.domain.Trade;
import bookstore.domain.TradeItem;
import bookstore.impl.AccountDAOImpl;
import bookstore.impl.BookDAOImpl;
import bookstore.impl.TradeDAOImpl;
import bookstore.impl.TradeItemDAOImpl;
import bookstore.impl.UserDAOImpl;
import bookstore.web.CriteriaBook;
import bookstore.web.Page;

public class BookService {

	private BookDAO bookDAO = new BookDAOImpl();

	public Page<Book> getPage(CriteriaBook criteriaBook) {
		return bookDAO.getPage(criteriaBook);
	}

	public Book getBook(int id) {
		return bookDAO.getBook(id);
	}

	public boolean addToCart(int id, ShoppingCart sc) {
		Book book = bookDAO.getBook(id);
		if (book != null) {
			sc.addBook(book);
			return true;
		}
		return false;
	}

	public void removeItemFromSHoppingCart(ShoppingCart sc, int id) {
		// TODO Auto-generated method stub
		sc.removeItem(id);
	}

	public void clearSoppingCart(ShoppingCart sc) {
		// TODO Auto-generated method stub
		sc.clear();
	}

	public void updateItemQuantity(ShoppingCart sc, int id, int quantity) {
		// TODO Auto-generated method stub
		sc.updataItemQuantity(id, quantity);
	}

	private AccountDAO accountDAO = new AccountDAOImpl();
	private TradeDAO tradeDAO = new TradeDAOImpl();
	private UserDAO userDAO = new UserDAOImpl();
	private TradeItemDAO tradeItemDAO = new TradeItemDAOImpl();
	
	public void cash(ShoppingCart shoppingCart, String username, String accountId) {
		//同时修改粗存和销售量
		bookDAO.batchUpdateStoreNumberAndSalesAmount(shoppingCart.getItems());
		//修改余额
		accountDAO.updataBalance(Integer.parseInt(accountId), shoppingCart.getTotalMoney());
		
		//交易记录
		Trade trade = new Trade();
		trade.setTradeTime(new Date(new java.util.Date().getTime()));
		trade.setUserId(userDAO.getUser(username).getUserId());
		tradeDAO.insert(trade);
		
		//封装交易内容对象的集合
		Collection<TradeItem> items = new ArrayList<TradeItem>();
		for(ShoppingCartItem sci : shoppingCart.getItems()) {
			TradeItem tradeItem = new TradeItem();
			tradeItem.setBookId(sci.getBook().getId());
			tradeItem.setQuantity(sci.getQuantity());
			tradeItem.setTradeId(trade.getTradeId());
			items.add(tradeItem);
		}
		tradeItemDAO.batchSave(items);
		
		//清空购物车ﳵ
		shoppingCart.clear();
	}

}
