<%@ page language="java" import="java.util.*"  contentType="text/html;charset=UTF-8" %>
<%@ include file="iframe/head.jsp" %>
<%String id=(String)request.getAttribute("id");%>
<div class="main">
    <div class="narea"><div>
        <img height="326" src="<%=basePath%>images/zgm.jpg" width="1020">
    </div>
    </div>
    <div class="rmain">
        <div class="tom"><div class="totitle"><span> </span></div></div>
        <div class="rlist">
            <FORM name="form1" method="post" action="<%=basePath %>UpController" enctype="multipart/form-data">
                <table width="100%" border="0" align="center" cellpadding="4" cellspacing="0" class="rtable">
                    <tbody>
                    <tr class="tr1"><input type="hidden" name="id" value="<%=id%>"><input type="hidden" name="method" value="sjzy">
                        <td class="rldatee daslist"></td>
                        <td class="rltitle daslist">&nbsp;&nbsp;&nbsp;&nbsp;上交实验</td>
                    </tr>
                    
                    <tr class="tr1">
                        <td class="rldatee daslist">上传实验：</td>
                        <td class="rltitle dotlist"><input type="file" size="30" name="pic" required /></td>
                    </tr>
                    <tr class="tr1">
                        <td class="rldatee daslist"></td>
                        <td class="rltitle daslist"><input type="submit" value="确定提交" style="width:80px;"/></td>
                    </tr>
                    </tbody>
                </table>
            </FORM>
        </div>
    </div>
</div>
<%@ include file="iframe/foot.jsp"%>