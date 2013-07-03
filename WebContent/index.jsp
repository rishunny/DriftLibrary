<%@page import="com.team512.model.Book"%>
<%@page import="com.team512.service.PageShowService"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<%@include file="head.jsp"%>

<body>
    <%@include file="header.jsp"%>

	<div class="container">
		<div class="row">
			<div class="span8">
				<div style="height:300px;" class="content">
                    <img class="img_logo" src="img/logo.png" alt="logo" />
                    <div>
                        <h1>Drift Library</h1>  
                    </div>
				</div>
                <div class="content">
                    <h3 style="float:left;">随机推荐</h3>
                    <a style="float:right;" href="#" class="unslider-arrow next button button-flat-primary button-tiny"> >> </a>
                    <a style="float:right;" href="#" class="unslider-arrow prev button button-flat-primary button-tiny"> << </a>
                    <div class="banner">
                        <ul>
                        <s:iterator value="%{list }" id="item" status="count">
                        <s:if test="#count.index%5==1">
                        <li>
                         <a href="bookDetail?bookId=${item.getBookId()}"><img class="img_cover" src="${item.getImage() }" alt="${item.getTitle() }" /></a>
                        </s:if>
                        <s:if test="#count.index%5==4">
                        <a href="bookDetail?bookId=${item.getBookId()}"><img class="img_cover" src="${item.getImage() }" alt="${item.getTitle() }" /></a>
                        </li>
                        </s:if>
                        <s:else>
                        <a href="bookDetail?bookId=${item.getBookId()}"><img class="img_cover" src="${item.getImage() }" alt="${item.getTitle() }" /></a>
                        </s:else>
                        </s:iterator>
                        
                        </ul>
                    </div>
                </div>
			</div>

			<div class="span4">
				<form  method="post" action="loginAction" class="content form-signin">
					<input type="text" class="input-block-level" placeholder="Email address" name="email">
					<input type="password" class="input-block-level" placeholder="Password" name="password">
					<label class="checkbox">
                        <input type="checkbox" value="remember-me">记住我</input>
					</label>
					<button class="button glow button-rounded button-flat-primary" type="submit">登录</button>
				</form>
			</div>
		</div>
	</div>

    <script type="text/javascript">
        var unslider = $('.banner').unslider();

        $('.unslider-arrow').click(function() {
            var fn = this.className.split(' ')[1];

            //  Either do unslider.data('unslider').next() or .prev() depending on the className
            unslider.data('unslider')[fn]();
        });
    </script>

</body>
</html>
