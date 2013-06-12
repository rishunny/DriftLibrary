package com.team512.dao;

import java.util.List;

public interface PageDAO {
	public List queryForPage(String hql,final int offset,final int length);
	public int getAllRowCount(String hql);
}
