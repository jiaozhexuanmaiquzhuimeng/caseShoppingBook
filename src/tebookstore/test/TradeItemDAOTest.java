package tebookstore.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import org.junit.Test;

import bookstore.dao.TradeItemDAO;
import bookstore.domain.TradeItem;
import bookstore.impl.TradeItemDAOImpl;

public class TradeItemDAOTest {

	private TradeItemDAO TradeItemDAO = new TradeItemDAOImpl();

	@Test
	public void testBatchSave() {
		Collection<TradeItem> items = new ArrayList<TradeItem>();
		
		items.add(new TradeItem(null, 1, 10, 25));
		items.add(new TradeItem(null, 2, 20, 25));
		
		TradeItemDAO.batchSave(items);
	}

	@Test
	public void testGetTradeItemsWithTradeId() {
		Set<TradeItem> items = TradeItemDAO.getTradeItemsWithTradeId(25);
		System.out.println(items);
	}

}
