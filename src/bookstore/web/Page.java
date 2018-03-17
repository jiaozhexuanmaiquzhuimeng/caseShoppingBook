package bookstore.web;

import java.util.List;

public class Page<T> {

	// 当前页
	private int pageNo;

	// 当前页存放的书
	private List<T> list;

	// 每页大小
	private int pageSize = 3;

	// 总记录数
	private long totalItemNumber;

	// 构造方法设置当前页
	public Page(int pageNo) {
		super();
		this.pageNo = pageNo;
	}

	// 获取当前页
	public int getPageNo() {
		if (pageNo < 0) {
			pageNo = 1;
		}

		if (pageNo > getTotalPageNumber()) {
			pageNo = getTotalPageNumber();
		}
		return pageNo;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public List<T> getList() {
		return list;
	}

	// 获得总页码
	public int getTotalPageNumber() {

		int totalPageNumber = (int) totalItemNumber / pageSize;
		if (totalPageNumber % pageSize != 0) {
			totalPageNumber++;
		}

		return totalPageNumber;
	}

	public void setTotalItemNumber(long totalItemNumber) {
		this.totalItemNumber = totalItemNumber;
	}

	public boolean isHasNext() {
		if (getPageNo() < getTotalPageNumber()) {
			return true;
		}
		return false;
	}

	public boolean isHasPrev() {
		if (getPageNo() > 1) {
			return true;
		}
		return false;
	}
	
	public int getPrevPage() {
		if(isHasPrev()) {
			return getPageNo() - 1;
		}
		return getPageNo();
	}
	
	public int getNextPage() {
		if(isHasNext()) {
			return getPageNo()+1;
		}
		return getPageNo();
	}
	
}
