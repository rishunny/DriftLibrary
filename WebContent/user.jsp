<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Drift Library</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" media="screen">
	<link rel="stylesheet" href="css/custom.css">
	<script src="http://code.jquery.com/jquery.js"></script>
	<script src="js/addbook.js"></script>
	<script src="js/bootstrap.min.js"></script>
</head>
<body>

    
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

    <div class="row-fluid">
        <div class="span6 offset2">
            <div class="content">
                <p>我的书架</p>
            </div>
        </div>

        <div class="span2">
            <div class="content box_user">
                <img class="user_photo" src="http://www.gravatar.com/avatar/f056d7298d8076c2c5283c078a9ad4a9?s=45" alt="" />
                <p class="user_name pd10" >tzwm</p>
                <br />
                <a class="pd10" href="#">设置</a>
                <br />
                
                <div class="userBox_count">
                    <span>
                        <label id="count_donate">0</label>
                        捐赠
                    </span>
                    <span>
                        <label id="count_borrow">0</label>
                        借入
                    </span>
                </div>
            </div>

            <div class="content">
                <h3>捐书</h3>
                    <input type="text" style="width:auto;" id="isbn_input" placeholder="ISBN" name="isbn_input" />
                    <input class="btn" type="button" name="donate" value="捐出" id="add_click"/>
            </div>
        </div>
    </div>

</body>
