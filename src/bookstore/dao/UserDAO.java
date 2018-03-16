package bookstore.dao;

import bookstore.domain.User;

public interface UserDAO {

	//根据用户姓名获取用户对象
	public abstract User getUser(String username);
}
