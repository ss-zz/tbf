<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<meta content="always" name="referrer">

<link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />

<link rel="stylesheet" type="text/css"
	href="/js_libs/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="/js_libs/bootstrap/css/bootstrap-theme.min.css">

<script src="/js_libs/jquery/jquery.min.js"></script>
<script src="/js_libs/bootstrap/js/bootstrap.min.js"></script>
<script src="/js_libs/vue/vue.min.js"></script>

<script src="/js_biz/tbf/main.js"></script>

<title>TBF</title>

</head>
<body>

	<div id="app">

		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
						aria-expanded="false">
						<span class="sr-only">切换</span> <span class="icon-bar"></span> <span
							class="icon-bar"></span> <span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="/">TBF</a>
				</div>

				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active"><a href="tbf/demo/pethome">我的宠物家园 <span
								class="sr-only">(current)</span></a></li>
						<li><a href="tbf/monitor">监控</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">其它 <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">其它1</a></li>
								<li><a href="#">其它2</a></li>
								<li><a href="#">其它3</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">其它4</a></li>
								<li role="separator" class="divider"></li>
								<li><a href="#">其它5</a></li>
							</ul></li>
					</ul>
					<form class="navbar-form navbar-left">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Search">
						</div>
						<button type="submit" class="btn btn-default">查询</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="tbf/user/center">个人中心</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">ADMIN <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="logout">退出</a></li>
							</ul></li>
					</ul>
				</div>
			</div>
		</nav>

		<div class="jumbotron">
			<h1>欢迎您!</h1>
			<p>tbf框架</p>
			<p>
				<a class="btn btn-primary btn-lg" href="#" role="button">进入主页</a>
			</p>
		</div>

	</div>

</body>
</html>