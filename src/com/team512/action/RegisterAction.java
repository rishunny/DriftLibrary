package com.team512.action;

import com.opensymphony.xwork2.ActionSupport;
import com.team512.dao.UserDAO;
import com.team512.model.User;

public class RegisterAction extends ActionSupport{
	private String user_name;
	private String user_email;
	private String address;
	private String user_password;
	private UserDAO userDAO;

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
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
		System.out.println(this.user_name);
		System.out.println(this.user_email);
		System.out.println(this.user_password);
		User user = new User();
		user.setAddress("test");
		user.setAuthority(0);
		user.setEmail(this.user_email);
		user.setMoney(0);
		user.setName(this.user_name);
		user.setPassWord(this.user_password);
		userDAO.save(user);
		return "success";
	}
	
}
