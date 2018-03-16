package bookstore.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import bookstore.dao.TradeDAO;
import bookstore.domain.Trade;

public class TradeDAOImpl extends BaseDAO<Trade> implements TradeDAO {

	@Override
	public void insert(Trade trade) {
		String sql = "insert into trade (userid, tradetime) values (?,?)";

		long tradeId = insert(sql, trade.getUserId(), trade.getTradeTime());
		trade.setTradeId((int)tradeId);
	}

	@Override
	public Set<Trade> getTradesWithUserId(Integer userId) {
		String sql = "select tradeId, userId, tradeTime from trade where userId=? order by tradeTime desc";
		return new LinkedHashSet(queryForList(sql, userId));
	}

}
