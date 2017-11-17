// 公共信息
var BASE_API = '/actuator/'

// 公共方法
var getRemoteDate = function(url, params, cb) {
	$.ajax({
		url : BASE_API + url,
		data : params,
		dataType : 'json',
		method : 'get',
		success : function(data) {
			if (cb)
				cb(handleAjaxData(data));
		},
		error : function(data) {
			if (cb)
				cb(handleAjaxData(data));
		}
	})
}
var handleAjaxData = function(data) {
	var ret = null;
	if (!data) {
		ret = data;
	} else if (data.responseJSON) {
		ret = data.responseJSON;
	} else {
		ret = data;
	}
	console.dir(ret);
	return ret;
}

// ---定义组件
// 概况
var SummaryComponent = {
	template : '<div>{{info}}</div>',
	data : function() {
		return {
			info : '---'
		}
	}
}
// 健康
var HealthComponent = {
	template : '#template-health',
	data : function() {
		return {
			info : {
				db : {},
				diskSpace : {},
				mail : {},
				status : null
			},
			currentTab : 'db'
		}
	},
	methods : {
		show : function(tab) {
			this.currentTab = tab;
		},
		showDisk : function(num){
			return num ? (num/1024/1024/1024).toFixed(2) + 'GB' : num;
		}
	},
	mounted : function() {
		var _this = this;
		getRemoteDate('health', null, function(data) {
			_this.info = data;
		});
	},
	attached : function() {
	}
}
// 磁盘
var DiskComponent = {
	template : '<div>磁盘</div>'
}

// ---定义路由
var routes = [ {
	path : '/',
	redirect : '/summary'
}, {
	path : '/summary',
	component : SummaryComponent
}, {
	path : '/health',
	component : HealthComponent
}, {
	path : '/disk',
	component : DiskComponent
} ]

// ---创建 router 实例
var router = new VueRouter({
	base : '/',
	linkActiveClass : 'active',
	routes : routes,
	scrollBehavior : function(to, from, savedPosition) {
		return {
			x : 0,
			y : 0
		}
	}
})

// ---创建和挂载根实例
var app = new Vue({
	el : '#app',
	router : router
})