package bookstorefilter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bookstore.db.JDBCUtils;
import bookstore.web.ConnectionContext;

/**
 * Servlet Filter implementation class TranactionFilter
 */
@WebFilter("/*")
public class TranactionFilter implements Filter {

    /**
     * Default constructor. 
     */
    public TranactionFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		Connection connection = null;
		
		try {
			//��ȡ����
			connection = JDBCUtils.getConnection();
			
			//��������
			connection.setAutoCommit(false);
			
			//����ThreadLocad������ǰ���Ӻ��̰߳�
			ConnectionContext.getInstance().bind(connection);
			
			//������ת��Ŀ��Servlet
			chain.doFilter(request, response);
			
			//�ύ����
			connection.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			//�ع�����
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			HttpServletResponse resp = (HttpServletResponse) response;
			HttpServletRequest request2 = (HttpServletRequest) request;
			resp.sendRedirect(request2.getContextPath()+"/error-1.jsp");
			
		}finally {
			ConnectionContext.getInstance().remove();
			
			JDBCUtils.releaseConnection(connection);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
