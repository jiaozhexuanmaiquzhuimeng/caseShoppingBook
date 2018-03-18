package bookstore.dao;

import bookstore.domain.Person;

public interface UserDao {

	Long selectByUserNameAndPassword(Person person);

}
