package com.team512.model;

/**
 * Book entity. @author MyEclipse Persistence Tools
 */

public class Book implements java.io.Serializable {

	// Fields

	private Integer docId;
	private String isbn;
	private Integer authorId;
	private Integer count;
	private Integer borrowed;

	// Constructors

	/** default constructor */
	public Book() {
	}

	/** minimal constructor */
	public Book(String isbn, Integer authorId) {
		this.isbn = isbn;
		this.authorId = authorId;
	}

	/** full constructor */
	public Book(String isbn, Integer authorId, Integer count, Integer borrowed) {
		this.isbn = isbn;
		this.authorId = authorId;
		this.count = count;
		this.borrowed = borrowed;
	}

	// Property accessors

	public Integer getDocId() {
		return this.docId;
	}

	public void setDocId(Integer docId) {
		this.docId = docId;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getBorrowed() {
		return this.borrowed;
	}

	public void setBorrowed(Integer borrowed) {
		this.borrowed = borrowed;
	}

}