package bookstore.domain;

public class BuyOrder {
	
	private int id;
	private String startAddress;
	private String endAddress;
	private int goodsId;
	private int quantityofgoods;
	private String orderTime;
	private int sellerId;
	private int buyersId;
	private float expresScost;
	
	
	
	public BuyOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BuyOrder(int id, String startAddress, String endAddress, int goodsId, int quantityofgoods, String orderTime,
			int sellerId, int buyersId, float expresScost) {
		super();
		this.id = id;
		this.startAddress = startAddress;
		this.endAddress = endAddress;
		this.goodsId = goodsId;
		this.quantityofgoods = quantityofgoods;
		this.orderTime = orderTime;
		this.sellerId = sellerId;
		this.buyersId = buyersId;
		this.expresScost = expresScost;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStartAddress() {
		return startAddress;
	}
	public void setStartAddress(String startAddress) {
		this.startAddress = startAddress;
	}
	public String getEndAddress() {
		return endAddress;
	}
	public void setEndAddress(String endAddress) {
		this.endAddress = endAddress;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public int getQuantityofgoods() {
		return quantityofgoods;
	}
	public void setQuantityofgoods(int quantityofgoods) {
		this.quantityofgoods = quantityofgoods;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
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
	public float getExpresScost() {
		return expresScost;
	}
	public void setExpresScost(float expresScost) {
		this.expresScost = expresScost;
	}
	
}
