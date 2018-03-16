package bookstore.dao;

import java.util.Set;

import bookstore.domain.Trade;

public interface TradeDAO {
	//天添加交易记录
	public abstract void insert(Trade trade);

	//返回若干交易记录对象
	public abstract Set<Trade> getTradesWithUserId(Integer userId);
	
}
