<%@page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

    <header class="navbar navbar-fixed-top navbar-inverse">
		<div class="navbar-inner">
			<div class="container-fluid">
				<nav>
					<ul class="nav">
						<li><a id="logo" href="#">Drift Library</a></li>
					</ul>

                    <form class="form-search header_search" action="query" method="post">
                        <div class="input-append">
                            <input class="span2 search-query searchKey" type="text" placeholder="你想要的图书" name="searchKey" id="searchKey"/>
                            <button class="btn" type="submit">搜索</button>
                        </div>
                    </form>

				</nav>
			</div>
		</div>
	</header>
 
