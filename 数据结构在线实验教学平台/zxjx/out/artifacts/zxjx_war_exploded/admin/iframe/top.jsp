<%@ page language="java" import="java.util.*"  contentType="text/html;charset=UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link rel="stylesheet" href="<%=basePath %>images/css/bootstrap.css" />
<link rel="stylesheet" href="<%=basePath %>images/css/css.css" />
<script type="text/javascript" src="<%=basePath %>images/js/jquery1.9.0.min.js"></script>
<script type="text/javascript" src="<%=basePath %>images/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=basePath %>images/js/sdmenu.js"></script>
<script type="text/javascript" src="<%=basePath %>images/js/laydate/laydate.js"></script>
 
<div class="header">
<div class="logo"><img src="<%=basePath %>images/img/logo.jpg" /></div>
<div class="header-right"><a href="<%=basePath%>index.jsp" target="_top">前台首页</a>
<i class="icon-off icon-white"></i> <a onclick="if (confirm('确定要退出吗？')) return true; else return false;" href="<%=basePath %>admin/adminExit" target="_top">注销退出</a>
<div id="modal-container-973558" class="modal hide fade" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:300px; margin-left:-150px; top:30%"> 
</div>
</div>
</div>