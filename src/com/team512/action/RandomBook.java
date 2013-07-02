package com.team512.action;

import com.opensymphony.xwork2.ActionSupport;
import com.team512.bean.PageBean;
import com.team512.dao.BookDAO;
import com.team512.model.Book;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

public class RandomBook extends ActionSupport{

	private BookDAO bookDAO;
	private PageBean pageBean;
	private List<Book>list;
	
	public PageBean getPageBean() {
		return pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	public List<Book> getList() {
		return list;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}

	public BookDAO getBookDAO() {
		return bookDAO;
	}

	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		int max = bookDAO.maxId();
		//int count = bookDAO.countId();
		int min = bookDAO.minId();
		int up = max-15;
		int rand = (int)(Math.random()*1000);
		int offset = rand%(up-min);
		String hql = "from Book";
		list = bookDAO.queryForPage(hql, offset, 15);
//		Book book = list.get(2);
//		System.out.println("title "+book.getImage());
//		HttpServletRequest request = ServletActionContext.getRequest();
//		request.setAttribute("list", list);
		return super.execute();
	}

}
