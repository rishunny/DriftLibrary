<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    
<%@include file="head.jsp" %>

<body>
    <%@include file="header.jsp" %>
 
    
    <div class="container">
        <div class="row">
            <div class="span8">
                <div class="content">
                    <div class="search_results">
                        <h3>搜索结果:</h3> 
                        <ul>                            
                        <s:iterator value="%{list }" id="item" status="count">
                           <li>
                                <img class="img_cover" src="${item.image }" alt="${item.title }" />
                                <div class="book_info">
                                    <p><a class="book_name" href="bookDetail?bookId=${item.getBookId()}">${item.title }</a></p>
                                    <p>作者:${item.getAuthor()}</p>
                                    <p>出版社:${item.getPublisher()}</p>
                                </div>        
                            </li>
                        </s:iterator>
                        
							<s:if test="%{pageBean.currentPage == 1}">
            				first preview
       					    </s:if>
							<s:else>
								<a href="listBook?page=1">first</a>
								<a
									href="listBook?page=<s:property value="%{pageBean.currentPage-1}"/>">preview</a>
							</s:else>
							<s:if test="%{pageBean.currentPage != pageBean.totalPage}">
								<a
									href="listBook?page=<s:property value="%{pageBean.currentPage+1}"/>">next</a>
								<a href="listBook?page=<s:property value="pageBean.totalPage"/>">last</a>
							</s:if>
							<s:else>
                                 next last
                            </s:else>
							<!-- <li>
                                <img class="img_cover" src="http://img3.douban.com/lpic/s6971618.jpg" alt="book1" />
                                <div class="book_info">
                                    <p><a class="book_name" href="#">Book Title</a></p>
                                    <p>作者</p>
                                    <p>出版社</p>
                                </div>        
                            </li>
                            <br />
                            
                            <li>
                                <img class="img_cover" src="http://img3.douban.com/lpic/s6971618.jpg" alt="book1" />
                                <div class="book_info">
                                    <p><a class="book_name" href="#">Book Title</a></p>
                                    <p>作者</p>
                                    <p>出版社</p>
                                </div>        
                            </li>
                            <br />
                            
                            <li>
                                <img class="img_cover" src="http://img3.douban.com/lpic/s6971618.jpg" alt="book1" />
                                <div class="book_info">
                                    <p><a class="book_name" href="#">Book Title</a></p>
                                    <p>作者</p>
                                    <p>出版社</p>
                                </div>        
                            </li> -->
                        </ul>
                    </div>
                </div> 
            </div>

        </div>
    </div> 

</body>

</html>
