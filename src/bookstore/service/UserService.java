package bookstore.service;

import bookstore.dao.UserDao;
import bookstore.daoImpl.UserDaoImpl;
import bookstore.domain.Person;

public class UserService {

	UserDao userDao = new UserDaoImpl();
	
	public Long login(Person person) {
		Long i = userDao.selectByUserNameAndPassword(person);
		return i;
	}
	
	public Long register(Person person) {
		Long info = userDao.register(person);
		return info;
	}

	/**
	 * @param username
	 * @return
	 */
	public Long selectCountByUserName(String username) {
		Long i = userDao.selectCountByUserName(username);
		return i;
	}
	
	

}
