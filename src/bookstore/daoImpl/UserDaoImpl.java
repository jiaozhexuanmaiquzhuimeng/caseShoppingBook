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

	@Override
	public Long update(Person person) {
		String sql = "UPDATE person SET storeName=?,`name`=?, idCard=?, address=?, phone=?, money=?, licenceAdress=?, imgName=?, imgAdress=? WHERE userName=?";
		update(sql, person.getStoreName(), person.getName(), person.getIdCard(), person.getAddress(), person.getPhone(), person.getMoney(), person.getLicenceAdress(), person.getImgName(), person.getImgAdress(), person.getUserName());
		return null;
	}

	@Override
	public long selectByStoreName(String storeName) {
		String sql = "select count(*) from person where storeName = ?";
		long val = getSingleVal(sql, storeName);
		return val;
	}

	@Override
	public Person selectUserByUserName(String username) {
		String sql = "SELECT `id`,`userName`,`passWord`,`name`,`address`,`role`,`phone`,`storeName`,"
				+ "`idCard`,`imgAdress`,`imgName`,`InsuranceAmount`,`Licence`,"
				+ "`LicenceImg`,`LicenceAdress`,`money`FROM `person` WHERE `person`.userName = ?";
				
		Person person = query(sql, username);
		return person;
	}
	

}
