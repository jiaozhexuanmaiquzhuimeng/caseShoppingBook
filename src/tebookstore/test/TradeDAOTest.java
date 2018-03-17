package tebookstore.test;

import java.sql.Date;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import bookstore.dao.TradeDAO;
import bookstore.domain.Trade;
import bookstore.impl.TradeDAOImpl;

public class TradeDAOTest {

	@Before
	public void setUp() throws Exception {
	}

	private TradeDAO tradeDAO = new TradeDAOImpl();
	@Test
	public void testInsertTrade() {
		Trade trade = new Trade();
		trade.setUserId(2);
		trade.setTradeTime(new Date(new java.util.Date().getTime()));
		
		tradeDAO.insert(trade);
	}

	@Test
	public void testGetTradesWithUserId() {
		Set<Trade> trades = tradeDAO.getTradesWithUserId(2);
		System.out.println(trades);
	}

}
