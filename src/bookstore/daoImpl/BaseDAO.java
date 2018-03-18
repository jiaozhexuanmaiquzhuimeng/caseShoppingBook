package bookstore.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import bookstore.dao.DAO;
import bookstore.db.JDBCUtils;
import bookstore.utils.Utils;
import bookstore.web.ConnectionContext;

public class BaseDAO<T> implements DAO<T> {

	private QueryRunner queryrunner = new QueryRunner();

	private Class<T> clazz;
	
	public BaseDAO() {
		clazz = Utils.getSuperGenericType(getClass());
	}
	@Override
	public long insert(String sql, Object... args) {

		long id = 0;

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {

			connection = ConnectionContext.getInstance().get();
			preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			if (args != null) {
				for (int i = 0; i < args.length; i++) {
					preparedStatement.setObject(i + 1, args[i]);
				}
			}
			preparedStatement.executeUpdate();

			// 插入时获取主键的值ֵ
			resultSet = preparedStatement.getGeneratedKeys();
			if (resultSet.next()) {
				id = resultSet.getLong(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			JDBCUtils.release(resultSet, preparedStatement);
		}

		return id;
	}

	@Override
	public void update(String sql, Object... args) {
		Connection connection = null;
		
		try {
			connection = ConnectionContext.getInstance().get();
			queryrunner.update(connection, sql, args);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public T query(String sql, Object... args) {
		Connection connection = null;

		try {
			connection = ConnectionContext.getInstance().get();
			return queryrunner.query(connection, sql, new BeanHandler<>(clazz), args);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<T> queryForList(String sql, Object... args) {
		Connection connection = null;

		try {
			connection = ConnectionContext.getInstance().get();
			return queryrunner.query(connection, sql, new BeanListHandler<>(clazz), args);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <V> V getSingleVal(String sql, Object... args) {
		Connection connection = null;

		try {
			
			connection = JDBCUtils.getConnection();
			
			return (V) queryrunner.query(connection, sql, new ScalarHandler(), args);
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			//JDBCUtils.releaseConnection(connection);
		}
		return null;
	}

	@Override
	public void batch(String sql, Object[] ... params) {
		Connection connection = null;
		try {
			//connection = ConnectionContext.getInstance().get();
			connection = ConnectionContext.getInstance().get();
			queryrunner.batch(connection, sql, params);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
