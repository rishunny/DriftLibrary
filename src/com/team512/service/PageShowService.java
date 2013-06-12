package com.team512.service;

import java.util.List;

import com.team512.bean.PageBean;
import com.team512.dao.BookDAO;
import com.team512.dao.PageDAO;
import com.team512.model.Book;

public class PageShowService{
	private BookDAO bookDAO;
	public PageBean queryForPage(String hql,int pageSize, int page) {
		// TODO Auto-generated method stub
		int allRow = bookDAO.getAllRowCount(hql);
		int totalPage = PageBean.countTotalPage(pageSize, allRow);
		final int offset = PageBean.countOffset(pageSize, page);    //当前页开始记录
        final int length = pageSize;    //每页记录数
        final int currentPage = PageBean.countCurrentPage(page);
        List list = bookDAO.queryForPage(hql,offset, length);        //"一页"的记录
        PageBean pageBean = new PageBean();
        pageBean.setPageSize(pageSize);    
        pageBean.setCurrentPage(currentPage);
        pageBean.setAllRow(allRow);
        pageBean.setTotalPage(totalPage);
        pageBean.setList(list);
        pageBean.init();
        return pageBean;
	}
	public BookDAO getBookDAO() {
		return bookDAO;
	}
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

}
