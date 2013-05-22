package com.team512.action;

import com.opensymphony.xwork2.ActionSupport;
import com.team512.dao.UserDAO;
import com.team512.model.User;

public class RegisterAction extends ActionSupport{
	private String name;
	private String email;
	private String address;
	private String password;
	private UserDAO userDAO;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("test1");
		User user = new User();
		user.setAddress("test");
		user.setAuthority(0);
		user.setEmail(this.email);
		user.setMoney(0);
		user.setName(this.name);
		user.setPassWord(this.password);
		System.out.println("e1");
		userDAO.save(user);
		System.out.println("e1");
		return "success";
	}
	
}
