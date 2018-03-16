package bookstore.domain;

import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class Trade {
	//交易的主码
	private Integer tradeId;
	
	//交易的时间
	private Date tradeTime;
	
	//交易的内容
	private Set<TradeItem> items = new LinkedHashSet<>();
	
	 //交易人的ID
	 private Integer userId;


	public Integer getTradeId() {
		return tradeId;
	}


	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}


	public Date getTradeTime() {
		return tradeTime;
	}


	public void setTradeTime(Date tradeTime ) {
		this.tradeTime = tradeTime;
	}


	public Set<TradeItem> getItems() {
		return items;
	}


	public void setItems(Set<TradeItem> items) {
		this.items = items;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	@Override
	public String toString() {
		return "Trade [tradeId=" + tradeId + ", tradeTime=" + tradeTime + ", userId=" + userId + "]";
	}

}
