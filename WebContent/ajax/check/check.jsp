<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<% 
	String email =  request.getParameter("e");
	if(email.length()==0){
	response.getWriter().write("");
	}
%>