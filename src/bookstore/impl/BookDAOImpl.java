package bookstore.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import bookstore.dao.BookDAO;
import bookstore.domain.Book;
import bookstore.domain.ShoppingCartItem;
import bookstore.web.CriteriaBook;
import bookstore.web.Page;

public class BookDAOImpl extends BaseDAO<Book> implements BookDAO {

	@Override
	public Book getBook(int id) {

		String sql = "select id, author, title, price, publishingDate, salesAmount, storeNumber, remark from mybooks where id=?";

		return query(sql, id);
	}

	@Override
	public Page<Book> getPage(CriteriaBook cb) {
		Page page = new Page<>(cb.getPageNo());

		page.setTotalItemNumber(getTotalBookNumber(cb));
		//获得当前页的书
		cb.setPageNo(page.getPageNo());
		page.setList(getPageList(cb, 3));
		
		return page;
	}

	@Override
	public long getTotalBookNumber(CriteriaBook cb) {
		String sql = "select count(id) from mybooks where price >= ? and price <=?";

		return getSingleVal(sql, cb.getMinPrice(), cb.getMaxPrice());
	}

	@Override
	public List<Book> getPageList(CriteriaBook cb, int pageSize) {
		String sql = "select id, author, title, price, publishingDate, salesAmount, "
				+ "storeNumber, remark from mybooks where price >= ? and price <=?" + "limit ?,?";

		return queryForList(sql, cb.getMinPrice(), cb.getMaxPrice(), (cb.getPageNo() - 1) * pageSize, pageSize);
	}

	@Override
	public int getStoreNumber(Integer id) {
		String sql = "select storeNumber from mybooks where id=?";
		return getSingleVal(sql, id);
	}

	@Override
	public void batchUpdateStoreNumberAndSalesAmount(Collection<ShoppingCartItem> items) {

		String sql = "update mybooks set salesAmount = salesAmount + ?, storeNumber = storeNumber - ? where id = ?";
		
		Object [][] params = null;
		params = new Object[items.size()][3];
		List<ShoppingCartItem> scis = new ArrayList<ShoppingCartItem>(items);
		for(int i = 0; i < items.size(); i++) {
			params[i][0] = scis.get(i).getQuantity();
			params[i][1] = scis.get(i).getQuantity();
			params[i][2] = scis.get(i).getBook().getId();
		}
		batch(sql, params);
	}
}
