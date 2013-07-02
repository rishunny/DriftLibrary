package com.team512.model;

/**
 * Book entity. @author MyEclipse Persistence Tools
 */

public class Book implements java.io.Serializable {

	// Fields

	private Integer bookId;
	private Integer userId;
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

	// Constructors

	/** default constructor */
	public Book() {
	}

	/** full constructor */
	public Book(Integer userId, String title, String subtitle, String author,
			String image, String authorIntro, String summary, String publisher,
			String pubdate, Integer status, String isbn) {
		this.userId = userId;
		this.title = title;
		this.subtitle = subtitle;
		this.author = author;
		this.image = image;
		this.authorIntro = authorIntro;
		this.summary = summary;
		this.publisher = publisher;
		this.pubdate = pubdate;
		this.status = status;
		this.isbn = isbn;
	}

	// Property accessors

	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return this.subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAuthorIntro() {
		return this.authorIntro;
	}

	public void setAuthorIntro(String authorIntro) {
		this.authorIntro = authorIntro;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPubdate() {
		return this.pubdate;
	}

	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}