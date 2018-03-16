package bookstore.domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
	
	private Map<Integer, ShoppingCartItem> books = new HashMap<>();
	
	
	//设置每类书籍的数量
	public void updataItemQuantity(Integer id,int quantity) {
		ShoppingCartItem sci = books.get(id);
		if (sci != null) {
			sci.setQuantity(quantity);
		}
	}
	
	//移除某类的书籍
	public void removeItem(Integer id) {
		books.remove(id);
	}
	
	//清空购物车ﳵ
	public void clear() {
		books.clear();
	}
	
	//判断购物车是否为空
	public boolean isEmpty() {
		return books.isEmpty();
	}
	
	//总的钱数
	public float getTotalMoney() {
		float total = 0;
		
		for(ShoppingCartItem sci :getItems()) {
			total += sci.getItemMoney();
		}
		
		return total;
	}
	
	///返回集合
	public Collection<ShoppingCartItem> getItems(){
		return books.values();
	}
	
	//购物车中多少本书
	public int getBookNumber() {
		int total=0;
		for(ShoppingCartItem sci : books.values()) {
			total+=sci.getQuantity();
		}
		return total;
	}
	
	
	public Map<Integer, ShoppingCartItem> getBooks() {
		return books;
	}
	
	//查询是否有某类的书籍
	public boolean hasBook(Integer id) {
		return books.containsKey(id);
	}
	
	//想购物车加入图书
	public void addBook(Book book) {
		//查询购物车中是否有相同的书
		ShoppingCartItem sci = books.get(book.getId());
		
		if(sci == null) {
			sci = new ShoppingCartItem(book);
			books.put(book.getId(), sci);
		}else {
			sci.increment();
		}
		
	}
	
}
