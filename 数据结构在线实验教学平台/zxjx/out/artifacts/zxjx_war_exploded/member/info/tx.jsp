<%@ page language="java" import="java.util.*"  contentType="text/html;charset=UTF-8"%>
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
%>
    <%
	String member=(String)session.getAttribute("member");
	if(member==null){
		response.sendRedirect(basePath+"/error.jsp");
	}
	else{
	    String url=cb.getString("select tx from member where username='"+member+"'");
%>
<body>
<div class="right_cont">
    <div class="title_right"><strong>头像信息管理</strong></div>
    <div style="width:900px;margin:auto;">
        <form action="<%=basePath %>UpController" method="post" name="form1" enctype="multipart/form-data">
            <table class="table table-bordered"><input type="hidden" name="method" value="uptx" />
                <tr>
                    <td width="40%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">当前头像：</td>
                    <td><img src="<%=basePath+url %>" width="200" height="250" border="0"/></td>
                </tr>
                <tr>
                    <td width="40%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">上传头像：</td>
                    <td><input type=file name="pic" class="span4" required/> jpg</td>
                </tr>
                <tr>
                    <td class="text-center" colspan="2"><input type="submit" value="确定" class="btn btn-info  " style="width:80px;" /></td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
    <%} %>

