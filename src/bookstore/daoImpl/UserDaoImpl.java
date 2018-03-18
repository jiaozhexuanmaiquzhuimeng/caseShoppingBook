package bookstore.daoImpl;

import java.sql.SQLException;

import bookstore.dao.UserDao;
import bookstore.db.JDBCUtils;
import bookstore.domain.Person;

public class UserDaoImpl extends BaseDAO<Person> implements UserDao {

	@Override
	public Long selectByUserNameAndPassword(Person person) {
		String sql = "select count(*) FROM person WHERE userName = ? AND `passWord` = ?";
		Long val = getSingleVal(sql, person.getUserName(), person.getPassWord());
		System.out.println(val);
		return val;
	}
	

}
