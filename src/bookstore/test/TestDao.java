package bookstore.test;

import java.sql.Connection;
import java.sql.SQLException;

import bookstore.db.JDBCUtils;

public class TestDao {
	public static void main(String[] args) {
		try {
			Connection connection = JDBCUtils.getConnection();
			System.out.println(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
