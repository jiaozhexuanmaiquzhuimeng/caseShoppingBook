package tebookstore.test;

import java.sql.Date;
import java.util.List;

import org.junit.Test;

import bookstore.domain.Book;
import bookstore.impl.BookDAOImpl;

public class BaseDAOTest {

	private BookDAOImpl bookDAOImpl = new BookDAOImpl();
	
	@Test
	public void testInsert() {
		String sql = "insert into trade (userid, tradetime) values(?,?)";
		long id = bookDAOImpl.insert(sql, 1, new Date(new java.util.Date().getTime()));
		System.out.println(id);
	}

	@Test
	public void testUpdate() {
		String sql = "update mybooks set salesamount = ? where id = ?";
		
		bookDAOImpl.update(sql, 10, 5);
	}

	@Test
	public void testQuery() {
		String sql = "select id, author, title, price, publishingDate, salesAmount, storeNumber, remark from mybooks where id=?";
		Book book = bookDAOImpl.query(sql, 4);
		System.out.println(book);
	}

	@Test
	public void testQueryForList() {
		String sql = "select id, author, title, price, publishingDate, salesAmount, storeNumber, remark from mybooks where id < ?";
		List<Book> books = bookDAOImpl.queryForList(sql, 4);
		System.out.println(books);
	}

	@Test
	public void testGetSingleVal() {
		String sql="select count(id) from mybooks";
		long count = bookDAOImpl.getSingleVal(sql);
		System.out.println(count);
	}

	@Test
	public void testBatch() {
		String sql ="update mybooks set salesAmount = ?, storeNumber= ? where id = ?";
		
		bookDAOImpl.batch(sql, new Object[] {2,2,1}, new Object[] {3,3,2}, new Object[] {4,4,3});
	}

}
