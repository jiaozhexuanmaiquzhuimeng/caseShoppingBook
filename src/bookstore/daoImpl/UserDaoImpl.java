package bookstore.daoImpl;

import bookstore.dao.UserDao;
import bookstore.domain.Person;

public class UserDaoImpl extends BaseDAO<Person> implements UserDao {

	@Override
	public Long selectByUserNameAndPassword(Person person) {
		String sql = "select count(*) FROM person WHERE userName = ? AND `passWord` = ?";
		Long val = getSingleVal(sql, person.getUserName(), person.getPassWord());
		System.out.println(val);
		return val;
	}

	@Override
	public Long register(Person person) {
		String sql = "INSERT INTO person(userName, `passWord`) VALUES(?,?)";
		insert(sql, person.getUserName(), person.getPassWord());
		return null;
	}

	@Override
	public Long selectCountByUserName(String username) {
		String sql = "select count(*) FROM person WHERE userName = ?";
		Long val = getSingleVal(sql,username);
		return val;
	}
	

}
