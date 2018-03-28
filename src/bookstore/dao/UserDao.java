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

	/**
	 * @param person
	 * @return
	 */
	public Long update(Person person);

	/**
	 * @param storeName
	 * @return
	 */
	public long selectByStoreName(String storeName);

	/**
	 * @param username
	 * @return
	 */
	public Person selectUserByUserName(String username);
	
	
}
