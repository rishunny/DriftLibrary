package com.team512.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.CorruptIndexException;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.Hits;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.store.FSDirectory;

import net.paoding.analysis.analyzer.PaodingAnalyzer;
import net.paoding.analysis.dictionary.Hit;

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
	public PageBean queryForSearchPage(String hql,int pageSize, int page) {
		// TODO Auto-generated method stub
		int allRow = bookDAO.getAllRowCount(hql);
		int totalPage = PageBean.countTotalPage(pageSize, allRow);
		final int offset = PageBean.countOffset(pageSize, page);    //当前页开始记录
        final int length = pageSize;    //每页记录数
        final int currentPage = PageBean.countCurrentPage(page);
        List<Book> list = bookDAO.queryForPage(hql,offset, length);        //"一页"的记录
        for(int i =0;i<list.size();i++){
        	Book book = list.get(i);
        	//System.out.println(book.getIsbn());
        }
        PageBean pageBean = new PageBean();
        pageBean.setPageSize(pageSize);    
        pageBean.setCurrentPage(currentPage);
        pageBean.setAllRow(allRow);
        pageBean.setTotalPage(totalPage);
        pageBean.setList(list);
        pageBean.init();
        return pageBean;
	}
	public void indexCreateUtil2(){
		System.out.println("c1");
		String hql = "from Book";
		List<Book> list = bookDAO.findAll(hql);
		Analyzer analyzer = new PaodingAnalyzer(); 
		try { 
			// 使用索引文件夹，庖丁解牛分词器创建IndexWriter 
			IndexWriter writer = new IndexWriter("d:/data/index/", 
			analyzer, true);
			
			for(int i = 0;i<list.size();i++){
				Book book = list.get(i);
				Document doc = new Document();
				//doc.add(new Field("docId", book.getDocId(), Field.Store.YES, Field.Index.TOKENIZED, Field.TermVector.NO));
				doc.add(new Field("isbn", book.getIsbn(), Field.Store.YES, Field.Index.TOKENIZED, Field.TermVector.NO));
				writer.addDocument(doc);
			}
			System.out.println("test1");
			writer.optimize(); 
			System.out.println("test2");
			writer.close();
			System.out.println("test3");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public void indexCreateUtil() throws CorruptIndexException, IOException{
		// 使用paoding中文分析器 
		IndexWriter writer=null;
		try{
        Analyzer analyzer = new PaodingAnalyzer();   
        FSDirectory directory = FSDirectory.getDirectory("d:/data/index/");   
        System.out.println(directory.toString());   
        writer = new IndexWriter(directory, analyzer, true);
		}catch (Exception e) {
			// TODO: handle exception
		}
        Document doc = new Document();   
  
        // 从业务逻辑层读取大于当前id的信息  
        String hql ="from Book";
        List list = bookDAO.findAll(hql); 
        Iterator iterator = list.iterator();   
        Book book = new Book();   
        while (iterator.hasNext()) {   
            doc = new Document();   
            book = (Book) iterator.next();   
            doc.add(new Field("isbn", "" + book.getIsbn(), Field.Store.YES,   
                    Field.Index.UN_TOKENIZED)); 
//            articleId = String.valueOf(news.getId());   
            try {   
                writer.addDocument(doc);   
            } catch (IOException e) {   
                e.printStackTrace();   
            }   
        }   
        // 优化并关闭   
        writer.optimize();   
        writer.close();   
	}
	public List indexSearchUtil(String searchkey){
		System.out.println("in1");
		Hits hits = mysearch(searchkey);
		System.out.println("in2");
		List<Book> list= new ArrayList<Book>();
		for (int i = 0; i < hits.length(); i++) { 
			try { 
			Document doc = hits.doc(i); 
			String isbn = doc.get("isbn"); 
			Book book = new Book();
			book.setIsbn(isbn);
			list.add(book); 
			} catch (IOException e) { 
				System.out.println(e);
			e.printStackTrace(); 
			}
		}
		return list;
	}
	public Hits mysearch(String queryString){
		Hits hits = null;
		System.out.println("s2");
		try {
			System.out.println("s3");
			File indexFile = new File("d:/data/index/");
			System.out.println("s4");
			IndexReader reader = IndexReader.open(indexFile);
			System.out.println("s5");
			Analyzer analyzer = new PaodingAnalyzer();
			System.out.println("s6");
			QueryParser parser = new QueryParser("isbn", analyzer);
			System.out.println("s7");
			IndexSearcher searcher = new IndexSearcher(reader); 
			System.out.println("s8");
			Query query = parser.parse(queryString); 
			System.out.println("s9");
			hits = searcher.search(query);
			System.out.println("s10");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("s11");
		return hits;
	}
	
	public BookDAO getBookDAO() {
		return bookDAO;
	}
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

}
