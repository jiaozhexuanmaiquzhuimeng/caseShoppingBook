package bookstore.domain;

public class ExpressOrder {
	
	private int id;
	private int expresscost;
	private int buyorderId;
	private String orderTime;
	private boolean yesOrno;
	
	public ExpressOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExpressOrder(int id, int expresscost, int buyorderId, String orderTime, boolean yesOrno) {
		super();
		this.id = id;
		this.expresscost = expresscost;
		this.buyorderId = buyorderId;
		this.orderTime = orderTime;
		this.yesOrno = yesOrno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getExpresscost() {
		return expresscost;
	}

	public void setExpresscost(int expresscost) {
		this.expresscost = expresscost;
	}

	public int getBuyorderId() {
		return buyorderId;
	}

	public void setBuyorderId(int buyorderId) {
		this.buyorderId = buyorderId;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public boolean isYesOrno() {
		return yesOrno;
	}

	public void setYesOrno(boolean yesOrno) {
		this.yesOrno = yesOrno;
	}
	
	
	
}
