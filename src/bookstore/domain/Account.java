package bookstore.domain;

public class Account {
	private int id;
	private float money;
	private String userName;
	private String passWord;
	private int userId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public Account(int id, float money, String userName, String passWord, int userId) {
		super();
		this.id = id;
		this.money = money;
		this.userName = userName;
		this.passWord = passWord;
		this.userId = userId;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
