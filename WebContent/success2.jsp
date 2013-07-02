<%@page import="com.team512.bean.PageBean"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <title>MyHtml.html</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
  
  <body>
   <s:iterator value="pageBean.list">
   <p>test</p>
        isbn:<s:property value="isbn"/>
   </s:iterator>
   test<br>
<c:forEach items="${book}" var="orderItem"> 
isbn:${orderItem.isbn} 
</c:forEach> 
        total<s:property value="pageBean.allRow"/>record
        total<s:property value="pageBean.totalPage"/> page
        now <s:property value="pageBean.currentPage"/>page<br/>
        
        <s:if test="%{pageBean.currentPage == 1}">
            first preview
        </s:if>
        <s:else>
            <a href="listBook?page=1">first</a>
            <a href="listBook?page=<s:property value="%{pageBean.currentPage-1}"/>">preview</a>
        </s:else>
        <s:if test="%{pageBean.currentPage != pageBean.totalPage}">
            <a href="listBook?page=<s:property value="%{pageBean.currentPage+1}"/>">next</a>
            <a href="listBook?page=<s:property value="pageBean.totalPage"/>">last</a>
        </s:if>
        <s:else>
            next last
        </s:else>
  </body>
</html>
