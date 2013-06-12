package com.team512.service;

import com.team512.bean.PageBean;

public interface PageShowService {
	public PageBean queryForPage(String hql,int pageSize,int page);
}
