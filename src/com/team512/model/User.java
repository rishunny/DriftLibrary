package com.team512.model;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String name;
	private String email;
	private String passWord;
	private String address;
	private Integer money;
	private Integer authority;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(Integer money, Integer authority) {
		this.money = money;
		this.authority = authority;
	}

	/** full constructor */
	public User(String name, String email, String passWord, String address,
			Integer money, Integer authority) {
		this.name = name;
		this.email = email;
		this.passWord = passWord;
		this.address = address;
		this.money = money;
		this.authority = authority;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getMoney() {
		return this.money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public Integer getAuthority() {
		return this.authority;
	}

	public void setAuthority(Integer authority) {
		this.authority = authority;
	}

}