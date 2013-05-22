package com.team512.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest srequest, ServletResponse sresponse,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest)srequest;
		HttpServletResponse response = (HttpServletResponse)sresponse;
		HttpSession session =request.getSession();
		String url = request.getServletPath();
		if(url.startsWith(""))url+="/DriftLibrary";
		if(url.startsWith("/DriftLibrary")&&!url.startsWith("/DirftLibrary/index")){
			String name = (String)session.getAttribute("username");
			if(name==null){
				response.sendRedirect("/DriftLibrary/index.html");
			}
		}
		chain.doFilter(srequest,sresponse);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
