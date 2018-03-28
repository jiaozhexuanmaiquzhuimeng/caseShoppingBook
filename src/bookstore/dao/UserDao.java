package bookstore.dao;

import bookstore.domain.Person;

public interface UserDao {
	
	//登陆实现
	public Long selectByUserNameAndPassword(Person person);
	
	//注册实现
	public Long register(Person person);

	/**
	 * @param username
	 * @return
	 */
	public Long selectCountByUserName(String username);
	
	
}
