package bookstore.domain;

public class TransactionRecord {
	
	private int id;
	private int sellerId;
	private int buyersId;
	private String data;
	private float money;
	
	public TransactionRecord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionRecord(int id, int sellerId, int buyersId, String data, float money) {
		super();
		this.id = id;
		this.sellerId = sellerId;
		this.buyersId = buyersId;
		this.data = data;
		this.money = money;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public int getBuyersId() {
		return buyersId;
	}

	public void setBuyersId(int buyersId) {
		this.buyersId = buyersId;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}
	
}
