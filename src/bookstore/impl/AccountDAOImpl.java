package bookstore.impl;

import bookstore.dao.AccountDAO;
import bookstore.domain.Account;

public class AccountDAOImpl extends BaseDAO<Account> implements AccountDAO {

	@Override
	public Account get(Integer accountId) {
			String sql = "select accountId, balance from account where accountid = ?";
			return query(sql, accountId);
	}

	@Override
	public void updataBalance(Integer accountId, float amount) {
		String sql = "update account set balance = balance - ? where accountId = ?";
		update(sql, amount, accountId);
	}

}
