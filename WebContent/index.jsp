
<%@page import="com.team512.service.PageShowService"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=utf-8"pageEncoding="utf-8" %>
<html>

<%@include file="head.jsp"%>

<body>
    <%@include file="header.jsp"%>

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span6 offset1">
				<div class="content content_primary">
                    <h3>About</h3>
				</div>
                <div class="content content_primary">
                    <h3 style="float:left;">随机推荐</h3>
                    <a style="float:right;" href="#" class="unslider-arrow next button button-flat-primary button-tiny"> >> </a>
                    <a style="float:right;" href="#" class="unslider-arrow prev button button-flat-primary button-tiny"> << </a>
                    <div class="banner">
                        <ul>
                            <li>
                                <img class="img_cover" src="http://img3.douban.com/lpic/s6971618.jpg" alt="book1" />
                                <img class="img_cover" src="http://img4.douban.com/lpic/s7647218.jpg" alt="book2" />
                                <img class="img_cover" src="http://img3.douban.com/lpic/s24927725.jpg" alt="book3" />
                                <img class="img_cover" src="http://img1.douban.com/lpic/s7658952.jpg" alt="book4" />
                                <img class="img_cover" src="http://img3.douban.com/lpic/s6521579.jpg" alt="book5" />
                            </li>
                            <li>            
                                <img class="img_cover" src="http://img3.douban.com/lpic/s24927725.jpg" alt="book3" />
                                <img class="img_cover" src="http://img3.douban.com/lpic/s6971618.jpg" alt="book1" />
                                <img class="img_cover" src="http://img4.douban.com/lpic/s7647218.jpg" alt="book2" />
                                <img class="img_cover" src="http://img1.douban.com/lpic/s7658952.jpg" alt="book4" />
                                <img class="img_cover" src="http://img3.douban.com/lpic/s6521579.jpg" alt="book5" />
                            </li>
                            <li>
                                <img class="img_cover" src="http://img1.douban.com/lpic/s7658952.jpg" alt="book4" />
                                <img class="img_cover" src="http://img3.douban.com/lpic/s6971618.jpg" alt="book1" />
                                <img class="img_cover" src="http://img4.douban.com/lpic/s7647218.jpg" alt="book2" />
                                <img class="img_cover" src="http://img3.douban.com/lpic/s24927725.jpg" alt="book3" />
                                <img class="img_cover" src="http://img3.douban.com/lpic/s6521579.jpg" alt="book5" />
                            </li>
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
