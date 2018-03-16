package tebookstore.test;

import org.junit.Test;

import bookstore.dao.UserDAO;
import bookstore.domain.User;
import bookstore.impl.UserDAOImpl;

public class UserDAOImplTest extends UserDAOImpl {

	private UserDAO UserDAO = new UserDAOImpl();
	@Test
	public void testGetUser() {
		User user = UserDAO.getUser("AAA");
		System.out.println(user);
	}

}
