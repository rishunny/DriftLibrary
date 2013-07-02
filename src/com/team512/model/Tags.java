package com.team512.model;

/**
 * Tags entity. @author MyEclipse Persistence Tools
 */

public class Tags implements java.io.Serializable {

	// Fields

	private Integer idTag;
	private Integer bookId;
	private String tag;

	// Constructors

	/** default constructor */
	public Tags() {
	}

	/** full constructor */
	public Tags(Integer bookId, String tag) {
		this.bookId = bookId;
		this.tag = tag;
	}

	// Property accessors

	public Integer getIdTag() {
		return this.idTag;
	}

	public void setIdTag(Integer idTag) {
		this.idTag = idTag;
	}

	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}