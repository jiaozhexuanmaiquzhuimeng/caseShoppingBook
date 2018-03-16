package bookstore.dao;

import bookstore.domain.Account;

public interface AccountDAO {
	
	 //根据账户id获得账户对象
	public abstract Account get(Integer accountId);
	
	//修改账户余额
	public abstract void updataBalance(Integer accountId,float amount);
}
