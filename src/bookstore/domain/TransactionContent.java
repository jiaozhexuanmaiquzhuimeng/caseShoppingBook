package bookstore.domain;

public class TransactionContent {
	
	private int id;
	private int goodId;
	private int goodNum;
	private int transactionrecordId;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGoodId() {
		return goodId;
	}

	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}

	public int getGoodNum() {
		return goodNum;
	}

	public void setGoodNum(int goodNum) {
		this.goodNum = goodNum;
	}

	public int getTransactionrecordId() {
		return transactionrecordId;
	}

	public void setTransactionrecordId(int transactionrecordId) {
		this.transactionrecordId = transactionrecordId;
	}

	public TransactionContent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionContent(int id, int goodId, int goodNum, int transactionrecordId) {
		super();
		this.id = id;
		this.goodId = goodId;
		this.goodNum = goodNum;
		this.transactionrecordId = transactionrecordId;
	}
	
	
}
