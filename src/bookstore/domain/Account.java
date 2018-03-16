package bookstore.domain;

public class Account {
	private Integer accoundId;
	private int balance;
	public Integer getAccoundId() {
		return accoundId;
	}
	public void setAccoundId(Integer accoundId) {
		this.accoundId = accoundId;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accoundId=" + accoundId + ", balance=" + balance + "]";
	}
	public Account() {
		super();
	}
	

}
