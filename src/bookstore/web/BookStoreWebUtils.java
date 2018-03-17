package bookstore.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import bookstore.domain.ShoppingCart;

public class BookStoreWebUtils {
	
	//获取购物车，如果没有就创建一个
	public static ShoppingCart getShoppngCart(HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		ShoppingCart sc = (ShoppingCart) session.getAttribute("ShoppingCart");
		
		if(sc == null) {
			sc = new ShoppingCart();
			session.setAttribute("ShoppingCart", sc);
		}
		
		return sc;
	}

}
