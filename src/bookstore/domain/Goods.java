package bookstore.domain;

public class Goods {
	private int id;
	private String goodsName;
	private float goodsPrice;
	private int goodsStock;
	private String goodsPicture;
	private String releaseTime;
	private String commodityDescription;
	private int sellerId;
	private String startAddress;
	private String endAddress;
	
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Goods(int id, String goodsName, float goodsPrice, int goodsStock, String goodsPicture, String releaseTime,
			String commodityDescription, int sellerId, String startAddress, String endAddress) {
		super();
		this.id = id;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.goodsStock = goodsStock;
		this.goodsPicture = goodsPicture;
		this.releaseTime = releaseTime;
		this.commodityDescription = commodityDescription;
		this.sellerId = sellerId;
		this.startAddress = startAddress;
		this.endAddress = endAddress;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public float getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public int getGoodsStock() {
		return goodsStock;
	}
	public void setGoodsStock(int goodsStock) {
		this.goodsStock = goodsStock;
	}
	public String getGoodsPicture() {
		return goodsPicture;
	}
	public void setGoodsPicture(String goodsPicture) {
		this.goodsPicture = goodsPicture;
	}
	public String getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(String releaseTime) {
		this.releaseTime = releaseTime;
	}
	public String getCommodityDescription() {
		return commodityDescription;
	}
	public void setCommodityDescription(String commodityDescription) {
		this.commodityDescription = commodityDescription;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
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
	
	
}
