package bookstore.domain;

//购物车中的输的种类和数量
public class ShoppingCartItem {
	private Book book;
	private int quantity;

	public ShoppingCartItem(Book book) {
		super();
		this.book = book;
		this.quantity = 1;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	//同类书籍的数量
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	//获得同类书籍的钱数
	public float getItemMoney() {
		return book.getPrice() * quantity;
	}

	// 同类书籍数量+1
	public void increment() {
		quantity++;
	}

}
