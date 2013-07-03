package com.team512.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.team512.bean.PageBean;
import com.team512.model.Book;
import com.team512.service.PageShowService;

public class SearchAction extends ActionSupport{
	private int page;
	private PageBean pageBean;
	private String searchKey;
	private List<Book> list;

	public List<Book> getList() {
		return list;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

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
		System.out.println("begin");
		System.out.println("search key is "+searchKey);
		String hql = "from Book as B where B.isbn like '%"+searchKey+"%' or B.title like '%"+searchKey+"%' or B.author like '%"+searchKey+"%'";
		this.pageBean = pageShowService.queryForSearchPage(hql, 5, page);
		list = pageBean.getList();
		System.out.println("list size:"+list.size());
		return "success";
	}

	private PageShowService pageShowService;

	public PageShowService getPageShowService() {
		return pageShowService;
	}

	public void setPageShowService(PageShowService pageShowService) {
		this.pageShowService = pageShowService;
	}
	
}
