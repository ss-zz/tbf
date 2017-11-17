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

<title>控制台</title>

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
						<li class="active"><a href="javascript: void(0);">控制台 <span
								class="sr-only">(current)</span></a></li>
					</ul>
				</div>
			</div>
		</nav>

		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-1">
					<ul class="nav nav-pills nav-stacked">
						<li><router-link to="/summary">概况</router-link></li>
						<li><router-link to="/health">健康</router-link></li>
						<li><router-link to="/disk">磁盘</router-link></li>
					</ul>
				</div>
				<div class="col-xs-11">
					<transition> <keep-alive> <router-view></router-view>
					</keep-alive> </transition>
				</div>
			</div>
		</div>

	</div>


	<script type="text/x-template" id="template-health">
	<div>

		<ul class="nav nav-tabs">
			<li class="active"><a href="javascript: void(0);" v-on:click="show('db')">数据库</a></li>
			<li><a href="javascript: void(0);" v-on:click="show('disk')">磁盘</a></li>
			<li><a href="javascript: void(0);" v-on:click="show('mail')">邮箱</a></li>
		</ul>

		<div class="panel" v-show="currentTab=='db'">
			<ul class="list-group" v-show="info.db">
				<li class="list-group-item">状态：{{info.db.status}}</li>
				<li class="list-group-item">数据库：{{info.db.database}}</li>
				<li class="list-group-item" v-show="info.db.error">错误信息：{{info.db.error}}</li>
			</ul>
			<ul class="list-group" v-show="!info.db">
				<li class="list-group-item">未配置</li>
			</ul>
		</div>
		<div class="panel" v-show="currentTab=='disk'">
			<ul class="list-group" v-show="info.diskSpace">
				<li class="list-group-item">状态：{{info.diskSpace.status}}</li>
				<li class="list-group-item">使用空间：{{showDisk(info.diskSpace.free)}}/{{showDisk(info.diskSpace.total)}}</li>
				<li class="list-group-item">threshold：{{info.diskSpace.threshold}}</li>
				<li class="list-group-item" v-show="info.diskSpace.error">错误信息：{{info.diskSpace.error}}</li>
			</ul>
			<ul class="list-group" v-show="!info.diskSpace">
				<li class="list-group-item">未配置</li>
			</ul>
		</div>
		<div class="panel" v-show="currentTab=='mail'">
			<ul class="list-group" v-show="info.mail">
				<li class="list-group-item">状态：{{info.mail.status}}</li>
				<li class="list-group-item">地址：{{info.mail.location}}</li>
				<li class="list-group-item" v-show="info.mail.error">错误信息：{{info.mail.error}}</li>
			</ul>
			<ul class="list-group" v-show="!info.mail">
				<li class="list-group-item">未配置</li>
			</ul>
		</div>

	</div>
	</script>

	<script src="/js_libs/jquery/jquery.min.js"></script>
	<script src="/js_libs/bootstrap/js/bootstrap.min.js"></script>
	<script src="/js_libs/vue/vue.min.js"></script>
	<script src="/js_libs/vue/vue-router.min.js"></script>
	<script src="/js_biz/tbf/monitor/main.js"></script>

</body>
</html>