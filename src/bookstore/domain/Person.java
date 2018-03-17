package bookstore.domain;

public class Person {
	private int id;
	private String userName;
	private int passWord;
	private String name;
	private String address;
	private String role;
	private int phone;
	
	
	
	public Person(int id, String userName, int passWord, String name, String address, String role, int phone) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.name = name;
		this.address = address;
		this.role = role;
		this.phone = phone;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getPassWord() {
		return passWord;
	}
	public void setPassWord(int passWord) {
		this.passWord = passWord;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
}
