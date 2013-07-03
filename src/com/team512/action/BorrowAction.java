package com.team512.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.team512.dao.BookDAO;
import com.team512.model.Book;
import com.team512.model.Need;

public class BorrowAction extends ActionSupport{

	private BookDAO bookDAO;
	private String isbn;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
		int userId = (Integer) ActionContext.getContext().getSession().get("user_id");
		Need need = new Need();
		need.setUserId(userId);
		need.setIsbn(isbn);
		System.out.println("f2");
		bookDAO.saveNeed(need);
		System.out.println("finished");
		return super.execute();
	}

}
