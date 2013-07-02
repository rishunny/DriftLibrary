<!DOCTYPE html>
<%@page import="com.team512.service.PageShowService"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>

<html>

<@include file="head.jsp">

<body>
    <@include file="header.jsp">

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span6 offset1">
				<div class="content">
                    <h3>About</h3>
				</div>
                <div class="content">
                    <h3>随机推荐</h3>
                </div>
			</div>

			<div class="span4">
				<form  method="post" action="loginAction" class="content form-signin">
					<input type="text" class="input-block-level" placeholder="Email address" name="email">
					<input type="password" class="input-block-level" placeholder="Password" name="password">
					<label class="checkbox">
                        <input type="checkbox" value="remember-me">记住我</input>
					</label>
					<button class="btn btn-large btn-primary" type="submit">登录</button>
				</form>
			</div>
		</div>
	</div>

</body>
</html>
