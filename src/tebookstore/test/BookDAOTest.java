package tebookstore.test;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import bookstore.domain.Book;
import bookstore.domain.ShoppingCartItem;
import bookstore.impl.BookDAOImpl;
import bookstore.web.CriteriaBook;
import bookstore.web.Page;

public class BookDAOTest {

	private BookDAOImpl BookDAO = new BookDAOImpl();

	@Test
	public void testGetBook() {
		Book book = BookDAO.getBook(5);
		System.out.println(book);
	}

	@Test
	public void testGetPage() {
		CriteriaBook cb = new CriteriaBook(50, 60, 2);
		Page<Book> page = BookDAO.getPage(cb);
		
		System.out.println("pageNo" + page.getPageNo());
		System.out.println("TotalPageNumber" + page.getTotalPageNumber());
		System.err.println("List"+page.getList());
		System.out.println("prev"+page.getPrevPage());
		System.out.println("next"+page.getNextPage());
	}

	@Test
	public void testGetStoreNumber() {
		int storeNumber = BookDAO.getStoreNumber(5);
		System.out.println(storeNumber);
	}

	@Test
	public void testBatchUpdateStoreNumberAndSalesAmount() {
		Collection<ShoppingCartItem> items = new ArrayList<ShoppingCartItem>();
		
		Book book = BookDAO.getBook(1);
		ShoppingCartItem sci = new ShoppingCartItem(book);
		sci.setQuantity(10);
		items.add(sci);
		
		book = BookDAO.getBook(2);
		sci = new ShoppingCartItem(book);
		sci.setQuantity(11);
		items.add(sci);
		
		book = BookDAO.getBook(3);
		sci = new ShoppingCartItem(book);
		sci.setQuantity(12);
		items.add(sci);
		
		book = BookDAO.getBook(4);
		sci = new ShoppingCartItem(book);
		sci.setQuantity(14);
		items.add(sci);
		
		BookDAO.batchUpdateStoreNumberAndSalesAmount(items);
	}

}
