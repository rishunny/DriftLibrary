package com.team512.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.team512.dao.UserDAO;

public class EmailCheckAction {
	private UserDAO userDAO;
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public void checkuser(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String email = request.getParameter("e");
		int i = userDAO.emailValidate(email);
		if(i==1){
			response.getWriter().write("该邮箱可以使用");
		}
		else{
			response.getWriter().write("该邮箱已被注册");
		}
		
	}
}
