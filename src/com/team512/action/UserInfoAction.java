package com.team512.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.team512.dao.BookDAO;
import com.team512.model.Book;
import com.team512.model.Need;

public class UserInfoAction extends ActionSupport {

	private BookDAO bookDAO;
	private List<Book> needlist;
	private List<Book> ownList;
	private int bookNum;
	private int borrowedNum;
	public int getBookNum() {
		return bookNum;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	public int getBorrowedNum() {
		return borrowedNum;
	}
	public void setBorrowedNum(int borrowedNum) {
		this.borrowedNum = borrowedNum;
	}
	public List<Book> getNeedlist() {
		return needlist;
	}
	public void setNeedlist(List<Book> needlist) {
		this.needlist = needlist;
	}
	public List<Book> getOwnList() {
		return ownList;
	}
	public void setOwnList(List<Book> ownList) {
		this.ownList = ownList;
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
		bookNum=bookDAO.count_books(1);
		needlist = bookDAO.needBooks(userId);
		ownList = bookDAO.myBooks(1);
		return "success";
	}
	
}
