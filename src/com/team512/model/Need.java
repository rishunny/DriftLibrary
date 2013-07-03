package com.team512.model;

/**
 * Need entity. @author MyEclipse Persistence Tools
 */

public class Need implements java.io.Serializable {

	// Fields

	private Integer needId;
	private String isbn;
	private Integer userId;

	// Constructors

	/** default constructor */
	public Need() {
	}

	/** minimal constructor */
	public Need(String isbn) {
		this.isbn = isbn;
	}

	/** full constructor */
	public Need(String isbn, Integer userId) {
		this.isbn = isbn;
		this.userId = userId;
	}

	// Property accessors

	public Integer getNeedId() {
		return this.needId;
	}

	public void setNeedId(Integer needId) {
		this.needId = needId;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}