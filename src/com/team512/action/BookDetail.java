package com.team512.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.team512.dao.BookDAO;
import com.team512.model.Book;

public class BookDetail extends ActionSupport{

	private BookDAO bookDAO;
	private int bookId;
	private Book book;
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
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
		List<Book> list = bookDAO.detail(bookId);
		book = list.get(0);
		return super.execute();
	}

}
