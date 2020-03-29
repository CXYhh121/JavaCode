<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<jsp:useBean id="cb" scope="page" class="com.bean.ComBean" />
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="<%=basePath %>images/css/bootstrap.css" />
<link rel="stylesheet" href="<%=basePath %>images/css/css.css" />
<script type="text/javascript" src="<%=basePath %>images/js/jquery1.9.0.min.js"></script>
<script type="text/javascript" src="<%=basePath %>images/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=basePath %>images/js/sdmenu.js"></script>
<script type="text/javascript" src="<%=basePath %>images/js/laydate/laydate.js"></script>
</head>
 
<%
String message = (String)request.getAttribute("message");
	if(message == null){
		message = "";
	}
	if (!message.trim().equals("")){
		out.println("<script language='javascript'>");
		out.println("alert('"+message+"');");
		out.println("</script>");
	}
	request.removeAttribute("message"); 
	
	String member=(String)session.getAttribute("member"); 
	if(member==null){
		response.sendRedirect(path+"index.jsp");
	}
	else{ 
		List mlist=cb.get1Com("select * from member where username='"+member+"'",11);
%>
<body>
<div class="right_cont">
<div class="title_right"><strong>用户信息管理</strong></div>  
<div style="width:900px;margin:auto;">
<form action="<%=basePath %>member/upMember" method="post" name="regform">
<table class="table table-bordered"> 
     <tr>
     <td width="40%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">用户姓名：</td>
     <td><input type="text" name="realname" class="span4" value="<%=mlist.get(3).toString() %>" required/></td> 
     </tr>
     <tr>
     <td width="40%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">用户性别：</td>
     <td><input type="radio" name="sex" value="男" checked /> 男 <input type="radio" name="sex" value="女"/> 女</td> 
     </tr>
     <tr>
     <td width="40%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">用户年龄：</td>
     <td><input type="number"  min="18" max="100" name="sfz" class="span4" value="<%=mlist.get(5).toString() %>" required/></td>
     </tr>
     <tr>
     <td width="40%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">联系电话：</td>
     <td><input type="text" name="tel" class="span4" value="<%=mlist.get(6).toString() %>" pattern="[0-9]{11}" title="11位手机号码" required/></td>
     </tr>
     <tr>
     <td width="40%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">注册邮箱：</td>
     <td><input type="email" name="email" class="span4" value="<%=mlist.get(7).toString() %>" required/></td> 
     </tr>
     <tr>
     	<td class="text-center" colspan="2"><input type="submit" value="确定修改" class="btn btn-info  " style="width:80px;" /></td>
     </tr>
     </table> 
</form>
   </div>  
 </div>  
</body>
<%} %>