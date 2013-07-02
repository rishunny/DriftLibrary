package com.team512.dao;

import java.sql.SQLException;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.hql.ast.HqlASTFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.team512.model.Book;
import com.team512.model.Tags;

/**
 * A data access object (DAO) providing persistence and search support for Book
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.team512.model.Book
 * @author MyEclipse Persistence Tools
 */
public class BookDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(BookDAO.class);
	// property constants
	public static final String USER_ID = "userId";
	public static final String TITLE = "title";
	public static final String SUBTITLE = "subtitle";
	public static final String AUTHOR = "author";
	public static final String IMAGE = "image";
	public static final String AUTHOR_INTRO = "authorIntro";
	public static final String SUMMARY = "summary";
	public static final String PUBLISHER = "publisher";
	public static final String PUBDATE = "pubdate";
	public static final String STATUS = "status";
	public static final String ISBN = "isbn";

	protected void initDao() {
		// do nothing
	}
	public List<Book> queryForPage(final String hql,final int offset, final int length) {
		// TODO Auto-generated method stub
		List list = getHibernateTemplate().executeFind(new HibernateCallback(){
            public Object doInHibernate(Session session) throws HibernateException,SQLException{
                Query query = session.createQuery(hql);
                query.setFirstResult(offset);
                query.setMaxResults(length);
                List<Book> list =query.list();
                return list;
            }
        });
        return list;
	}

	public int getAllRowCount(String hql) {
		// TODO Auto-generated method stub
		 return getHibernateTemplate().find(hql).size();
	}
	public int saveBook(Book transientInstance){
		int i = 0;
		log.debug("saving Book instance");
		try {
			getHibernateTemplate().save(transientInstance);
			i = transientInstance.getBookId();
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
		return i;
	}
	public void saveTags(Tags tags){
		log.debug("saving Book instance");
		try {
			getHibernateTemplate().save(tags);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			System.out.println(re);
			throw re;
		}
	}
	public int checkISBN(String isbn,int userId){
		try {
			String hql = "from Book as B where B.userId="+userId+" and B.isbn=?";
			List list = getHibernateTemplate().find(hql,new String[]{isbn});
			if(list.size()>0){
				return 1;
			}
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
		return 0;
	}
	public void save(Book transientInstance) {
		log.debug("saving Book instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Book persistentInstance) {
		log.debug("deleting Book instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Book findById(java.lang.Integer id) {
		log.debug("getting Book instance with id: " + id);
		try {
			Book instance = (Book) getHibernateTemplate().get(
					"com.team512.model.Book", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Book instance) {
		log.debug("finding Book instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Book instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Book as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findBySubtitle(Object subtitle) {
		return findByProperty(SUBTITLE, subtitle);
	}

	public List findByAuthor(Object author) {
		return findByProperty(AUTHOR, author);
	}

	public List findByImage(Object image) {
		return findByProperty(IMAGE, image);
	}

	public List findByAuthorIntro(Object authorIntro) {
		return findByProperty(AUTHOR_INTRO, authorIntro);
	}

	public List findBySummary(Object summary) {
		return findByProperty(SUMMARY, summary);
	}

	public List findByPublisher(Object publisher) {
		return findByProperty(PUBLISHER, publisher);
	}

	public List findByPubdate(Object pubdate) {
		return findByProperty(PUBDATE, pubdate);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findByIsbn(Object isbn) {
		return findByProperty(ISBN, isbn);
	}

	public List findAll(String queryString) {
		log.debug("finding all Book instances");
		try {
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Book merge(Book detachedInstance) {
		log.debug("merging Book instance");
		try {
			Book result = (Book) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Book instance) {
		log.debug("attaching dirty Book instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Book instance) {
		log.debug("attaching clean Book instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BookDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BookDAO) ctx.getBean("BookDAO");
	}
}