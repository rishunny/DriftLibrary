package com.team512.action;

import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.team512.dao.BookDAO;
import com.team512.model.Book;
import com.team512.model.Tags;

public class AddBookAction extends ActionSupport{
	private String title;
	private String subtitle;
	private String author;
	private String image;
	private String authorIntro;
	private String summary;
	private String publisher;
	private String pubdate;
	private Integer status;
	private String isbn;
	private String tag;
	private String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	private BookDAO bookDAO;
	public BookDAO getBookDAO() {
		return bookDAO;
	}
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAuthorIntro() {
		return authorIntro;
	}
	public void setAuthorIntro(String authorIntro) {
		this.authorIntro = authorIntro;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPubdate() {
		return pubdate;
	}
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void addBook(){
		
		//String userId_str=(String)(ActionContext.getContext().getSession().get("user_id")); 
		//int userId = (Integer) ActionContext.getContext().getSession().get("user_id");
		System.out.println("begin");
		int userId = 1;
		Book book = new Book();
		book.setTitle(title);
		book.setSubtitle(subtitle);
		book.setAuthor(author);
		book.setImage(image);
		book.setAuthorIntro(authorIntro);
		book.setSummary(summary);
		book.setPublisher(publisher);
		book.setPubdate(pubdate);
		book.setIsbn(isbn);
		book.setStatus(1);
		book.setUserId(userId);
		System.out.println("test ");
		System.out.println("alt is "+url);
		book.setUrl(url);
		int bookId = bookDAO.saveBook(book);
		JSONArray array = JSONArray.fromObject(tag);
		int size = array.size();
		for(int i = 0;i<size;i++){
			JSONObject object = array.getJSONObject(i);
			String name = object.getString("name");
			Tags tags = new Tags();
			tags.setBookId(bookId);
			tags.setTag(name);
			bookDAO.saveTags(tags);
		}
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		//int userId = (Integer) ActionContext.getContext().getSession().get("user_id");
		int userId = 1;
		int i = bookDAO.checkISBN(isbn, userId);
		if(i==1){
			ServletActionContext.getResponse().getWriter().write("repeat");
			return null;
		}
		addBook();
		ServletActionContext.getResponse().getWriter().write("success");
		return null;
	}

}
