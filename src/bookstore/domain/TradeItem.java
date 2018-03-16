package bookstore.domain;

public class TradeItem {

	//交易内容ID
	private Integer tradeItemId;

	//交易的书
	private Book book;

	private int quantity;

	//交易的书的ID(交易的那本书)
	private Integer bookId;

	//关联交易记录的ID
	private Integer tradeId;

	public Integer getTradeItemId() {
		return tradeItemId;
	}

	public void setTradeItemId(Integer tradeItemId) {
		this.tradeItemId = tradeItemId;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Integer getTradeId() {
		return tradeId;
	}

	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}


	public TradeItem(Integer tradeItemId, Integer bookId, int quantity, Integer tradeId) {
		super();
		this.tradeItemId = tradeItemId;
		this.bookId = bookId;
		this.quantity = quantity;
		this.tradeId = tradeId;
	}

	public TradeItem() {
		super();
	}

	@Override
	public String toString() {
		return "TradeItem [tradeItemId=" + tradeItemId + ", quantity=" + quantity + ", bookId=" + bookId + "]";
	}

}
