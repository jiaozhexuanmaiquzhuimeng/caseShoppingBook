package bookstore.dao;

import java.util.Collection;
import java.util.Set;

import bookstore.domain.TradeItem;

public interface TradeItemDAO {
	//批处理进行交易内容的保存
	public abstract void batchSave(Collection<TradeItem> items);
	
	//根据交易记录查询交易内容对象的集合
	public abstract Set<TradeItem> getTradeItemsWithTradeId(Integer tradeId);

}
