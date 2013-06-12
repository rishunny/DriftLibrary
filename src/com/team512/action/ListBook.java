package com.team512.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.team512.bean.PageBean;
import com.team512.model.Book;
import com.team512.service.PageShowService;

public class ListBook extends ActionSupport{
	private int page;
	private PageBean pageBean;
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public PageBean getPageBean() {
		return pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		String hql = "from Book";
		this.pageBean = pageShowService.queryForPage(hql, 5, page);
		return super.execute();
	}

	private PageShowService pageShowService;

	public PageShowService getPageShowService() {
		return pageShowService;
	}

	public void setPageShowService(PageShowService pageShowService) {
		this.pageShowService = pageShowService;
	}
	
}
