package bookstore.dao;

import java.util.Collection;
import java.util.List;

import bookstore.domain.Book;
import bookstore.domain.ShoppingCartItem;
import bookstore.web.CriteriaBook;
import bookstore.web.Page;

public interface BookDAO {

	//根据id获取图书对象
	public abstract Book getBook(int id);
	
	//根据书的价格和当前页封装书页信息
	public abstract Page<Book> getPage(CriteriaBook cb);
	
	//���ݴ����CriteriaBook���󷵻����Ӧ�ļ�¼��
	public abstract long getTotalBookNumber(CriteriaBook cb);
	
	//���ݴ����CriteriaBook��pageSize���ص�ǰҳ��Ӧ��List
	public abstract List<Book> getPageList(CriteriaBook cb,int pageSize);
	
	//����ָ����id��Book��storeNumber�ֶε�ֵ
	public abstract int getStoreNumber(Integer id);
	
	//同时修改粗存和销售量ֵ
	public abstract void batchUpdateStoreNumberAndSalesAmount(Collection<ShoppingCartItem> items);
}
