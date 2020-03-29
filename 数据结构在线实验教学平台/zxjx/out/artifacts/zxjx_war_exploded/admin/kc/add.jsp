<%@ page language="java" import="java.util.*"  contentType="text/html;charset=gb2312"%>
<jsp:useBean id="cb" scope="page" class="com.bean.ComBean" />  
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    String htmlData = request.getParameter("nr") != null ? request.getParameter("nr") : "";
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

<link rel="stylesheet" href="<%=basePath %>editor/themes/default/default.css" />
	<link rel="stylesheet" href="<%=basePath %>editor/plugins/code/prettify.css" />
	<script charset="utf-8" src="<%=basePath %>editor/kindeditor.js"></script>
	<script charset="utf-8" src="<%=basePath %>editor/lang/zh_CN.js"></script>
	<script charset="utf-8" src="<%=basePath %>editor/plugins/code/prettify.js"></script>
	<script>
		KindEditor.ready(function(K) {
			var editor1 = K.create('textarea[name="nr"]', {
				cssPath : '<%=basePath %>editor/plugins/code/prettify.css',
				uploadJson : '<%=basePath %>editor/jsp/upload_json.jsp',
				fileManagerJson : '<%=basePath %>editor/jsp/file_manager_json.jsp',
				allowFileManager : true,
				afterCreate : function() {
					var self = this;
					K.ctrl(document, 13, function() {
						self.sync();
						document.forms['form1'].submit();
					});
					K.ctrl(self.edit.doc, 13, function() {
						self.sync();
						document.forms['form1'].submit();
					});
				}
			});
			prettyPrint();
		});
	</script>
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
	
	String username=(String)session.getAttribute("user"); 
	if(username==null){
		response.sendRedirect(path+"index.jsp");
	}
	else{ 
		String method=request.getParameter("method");  
		String id="";String bt="";String fl=""; String url="";String nr="";
		if(method.equals("upkc")){
			id=request.getParameter("id");
			List jlist = cb.get1Com("select * from kc where id='"+id+"'",5);
			bt=jlist.get(1).toString();
			fl=jlist.get(2).toString();  
			nr=jlist.get(4).toString();
			htmlData=nr; 
		}	  
%>
<body>
<div class="right_cont">
    <div class="title_right"><strong>�γ���Ϣ����</strong></div>
    <div style="width:900px;margin:auto;">
        <form action="<%=basePath %>UpController" method="post" name="form1" enctype="multipart/form-data">
            <table class="table table-bordered">
                <tr><input type="hidden" name="method" value="<%=method%>" /><input type="hidden" name="id" value="<%=id%>" />
                    <td width="40%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">��Ϣ���⣺</td>
                    <td><input type="text" name="bt" class="span6" value="<%=bt %>" required/></td>
                </tr>
                <tr>
                    <td width="40%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">��Ϣ��Դ��</td>
                    <td><input type="text" name="fl" class="span6" value="<%=fl %>" required/></td>
                </tr>
                <tr>
                    <td width="40%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">�ϴ�jpg�ļ���</td>
                    <td>
                        <%if(method.equals("upkc")){%>
                        <input type=file name="pic" class="span4"/>
                        <%}else{%>
                        <input type=file name="pic" class="span4" required/>
                        <%} %>
                    </td>
                </tr>
                <tr>
                    <td width="40%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">��ϸ���ݣ�</td>
                    <td><textarea name="nr" cols="100" rows="8" style="width:700px;height:400px;visibility:hidden;"><%=htmlspecialchars(htmlData)%></textarea></td>
                </tr>
                <tr>
                    <td class="text-center" colspan="2"><input type="submit" value="ȷ��" class="btn btn-info  " style="width:80px;" /></td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
<%} %>
<%!
private String htmlspecialchars(String str) {
    str = str.replaceAll("&", "&amp;");
    str = str.replaceAll("<", "&lt;");
    str = str.replaceAll(">", "&gt;");
    str = str.replaceAll("\"", "&quot;");
    return str;
}
%>