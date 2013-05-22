package com.team512.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.team512.dao.UserDAO;

public class LoginAction extends ActionSupport {

	private UserDAO userDAO;
	private String email;
	private String password;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		int i = userDAO.loginValidate(this.email, this.password);
		System.out.println("lo1");
		//List list = userDAO.findAll();
		//int i = 0;
		System.out.println("lo2");
		if(i==0) return "success";
		else return "error";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
}
