package tebookstore.test;

import org.junit.Test;

import bookstore.dao.AccountDAO;
import bookstore.domain.Account;
import bookstore.impl.AccountDAOImpl;

public class AccountDAOImplTest {

	
	AccountDAO accountDAO = new  AccountDAOImpl();
	
	@Test
	public void testGet() {
		Account account = accountDAO.get(1);
		System.out.println(account.getBalance());
	}

	@Test
	public void testUpdataBalance() {
		accountDAO.updataBalance(1, 50);
	}

}
