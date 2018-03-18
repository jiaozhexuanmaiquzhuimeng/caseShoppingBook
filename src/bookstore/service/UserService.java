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

}
