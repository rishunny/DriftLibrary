package com.team512.service;

import java.util.List;

import com.team512.bean.PageBean;
import com.team512.dao.PageDAOImpl;

public class PageShowServiceImpl implements PageShowService{
	private PageDAOImpl pageDAOImpl;
	public PageDAOImpl getPageDAOImpl() {
		return pageDAOImpl;
	}
	public void setPageDAOImpl(PageDAOImpl pageDAOImpl) {
		this.pageDAOImpl = pageDAOImpl;
	}
	@Override
	public PageBean queryForPage(String hql,int pageSize, int page) {
		// TODO Auto-generated method stub
		int allRow = pageDAOImpl.getAllRowCount(hql);
		int totalPage = PageBean.countTotalPage(pageSize, allRow);
		final int offset = PageBean.countOffset(pageSize, page);    //当前页开始记录
        final int length = pageSize;    //每页记录数
        final int currentPage = PageBean.countCurrentPage(page);
        List list = pageDAOImpl.queryForPage(hql,offset, length);        //"一页"的记录
        PageBean pageBean = new PageBean();
        pageBean.setPageSize(pageSize);    
        pageBean.setCurrentPage(currentPage);
        pageBean.setAllRow(allRow);
        pageBean.setTotalPage(totalPage);
        pageBean.setList(list);
        pageBean.init();
        return pageBean;
	}

}
