<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    
	<title>Drift Library</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" media="screen">
	<link rel="stylesheet" href="css/custom.css">
	<script type="text/javascript" src="js/jquery-1.10.1.js"></script>
	<script type="text/javascript" src="js/jquery.validate.js"></script>
	<script type="text/javascript" src="js/additional-methods.js"></script>
	<script type="text/javascript" src="js/validate.js"></script>
	<style type="text/css">
	label.error{
	color:red;
	}
	</style>
</head>

<body>
	<!-- <script src="http://code.jquery.com/jquery.js"></script> -->
	<script src="js/bootstrap.min.js"></script>

	<header class="navbar navbar-fixed-top navbar-inverse">
		<div class="navbar-inner">
			<div class="container-fluid">
				<nav>
					<ul class="nav">
						<li><a id="logo" href="#">Drift Library</a></li>
					</ul>
					<ul class="nav pull-right">
						<li><a href="#">Home</a></li>
						<li><a href="#">About</a></li>
					</ul>
				</nav>
			</div>
		</div>
	</header>
    
    <div class="alert alert-success">
        <p>注册成功</p>
    </div>

    <div class="container">
        <form method="post" class="form-signup" id="form-signup" action="registerAction">
			<h2 class="form-signup-heading"></h2>
                  <label for="user_name">注册</label>
                  <input id="user_name" type="text" name="user_name" />
                  
                  <label for="user_email">邮箱</label>
                  <input id="user_email" type="text"  name="user_email"/>
			<div class="info">
				<table>
					<tbody>
						<tr id="info_email"></tr>
					</tbody>
				</table>
			</div>
			
			<label for="user_password">密码</label>
                  <input id="user_password" type="password" name="user_password"/>

                  <label for="user_password_confirmation">确认密码</label>
                  <input id="user_password_confirmation" type="password" name="user_password_confirmation" />

                  <input class="btn btn-large btn-primary" type="submit" name="commit" value="提交" />
		</form>
    </div>

</body>
</html>
