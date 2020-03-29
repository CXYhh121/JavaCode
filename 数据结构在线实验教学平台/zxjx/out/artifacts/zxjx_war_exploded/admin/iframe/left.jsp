<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="<%=basePath %>images/css/bootstrap.css" />
<link rel="stylesheet" href="<%=basePath %>images/css/css.css" />
<script type="text/javascript" src="<%=basePath %>images/js/jquery1.9.0.min.js"></script>
<script type="text/javascript" src="<%=basePath %>images/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=basePath %>images/js/sdmenu.js"></script>
<script type="text/javascript" src="<%=basePath %>images/js/laydate/laydate.js"></script>
</HEAD>
<%
	String username=(String)session.getAttribute("user");  String sf=(String)session.getAttribute("sf");
	if(username==null){
		response.sendRedirect(path+"index.jsp");
	}
	else{ 
%>
<body>
<div class="left">
<script type="text/javascript">
	var myMenu;
	window.onload = function() {
		myMenu = new SDMenu("my_menu");
		myMenu.init();
	};
</script>

<div id="my_menu" class="sdmenu">

	<div class="collapsed">
		<span>密码信息管理</span>
		<a href="<%=basePath %>admin/system/pwd.jsp" target="MainFrame">密码信息管理</a>
	</div>
	<div class="collapsed">
		<span>用户信息管理</span>
		<a href="<%=basePath %>admin/system/index2.jsp" target="MainFrame">用户信息管理</a>
	</div>
	<%if(sf.equals("管理员")){%>
	<div class="collapsed">
		<span>教师用户管理</span>
		<a href="<%=basePath %>admin/system/index.jsp" target="MainFrame">教师用户管理</a>
		<a href="<%=basePath %>admin/system/add.jsp?method=addm" target="MainFrame">增加教师用户</a>
		<a href="<%=basePath %>admin/system/s.jsp" target="MainFrame">教师用户查询</a>
	</div>
	<div class="collapsed">
		<span>注册用户管理</span>
		<a href="<%=basePath %>admin/member/index.jsp" target="MainFrame">注册用户管理</a>  
		<a href="<%=basePath %>admin/member/s.jsp" target="MainFrame">注册用户查询</a> 
	</div>  
	<div class="collapsed">
		<span>通知公告管理</span>
		<a href="<%=basePath %>admin/xw/index.jsp" target="MainFrame">通知公告管理</a>
		<a href="<%=basePath %>admin/xw/add.jsp?method=addxw" target="MainFrame">增加通知公告</a>
		 <a href="<%=basePath %>admin/xw/s.jsp" target="MainFrame">通知公告查询</a>
	</div> 
	<%}else{%>
	<div class="collapsed">
		<span>课程信息管理</span>
		<a href="<%=basePath %>admin/kc/index.jsp" target="MainFrame">课程信息管理</a>
		<a href="<%=basePath %>admin/kc/add.jsp?method=addkc" target="MainFrame">增加课程信息</a>
		<a href="<%=basePath %>admin/kc/s.jsp" target="MainFrame">课程信息查询</a>
	</div> 
	 
	<div class="collapsed">
		<span>发布实验管理</span>
		<a href="<%=basePath %>admin/zy/index.jsp" target="MainFrame">发布实验管理</a>
		<a href="<%=basePath %>admin/zy/add.jsp?method=addzy" target="MainFrame">增加发布实验</a>
		<a href="<%=basePath %>admin/zy/s.jsp" target="MainFrame">发布实验查询</a>
	</div>
	<div class="collapsed">
		<span>在线交流管理</span>
		<a href="<%=basePath %>admin/ly/index.jsp" target="MainFrame">在线交流管理</a>
		<a href="<%=basePath %>admin/ly/s.jsp" target="MainFrame">在线交流查询</a>
	</div>
	<div class="collapsed">
		<span>上交实验管理</span>
		<a href="<%=basePath %>admin/sj/index.jsp" target="MainFrame">上交实验管理</a>
		<a href="<%=basePath %>admin/sj/s.jsp" target="MainFrame">上交实验查询</a>
	</div>

	<%}%>
 	<div class="collapsed">
		<span>注销退出系统</span>
		<a onclick="if (confirm('确定要退出吗？')) return true; else return false;" href="<%=basePath %>admin/adminExit" target="_top" >注销退出系统</a>
	</div> 
</div>
</div>
<div class="Switch"></div>
<script type="text/javascript">
	$(document).ready(function(e) {
	$(".Switch").click(function(){
		$(".left").toggle();
	});
	});
</script> 
</body>
<%} %>

</html>
