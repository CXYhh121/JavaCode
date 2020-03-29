<%@ page language="java" import="java.util.*"  contentType="text/html;charset=UTF-8" %>
<%@ include file="iframe/head.jsp" %> 

<div class="main">
    <div class="narea"><div>
        <img height="326" src="<%=basePath%>images/zgm.jpg" width="1020">
    </div>
    </div>
    <div class="rmain">
        <div class="tom"><div class="totitle"><span> </span></div></div>
        <div class="rlist">
            <FORM name="form1" method="post" action="<%=basePath %>skc.jsp">
                <table width="100%" border="0" align="center" cellpadding="4" cellspacing="0" class="rtable">
                    <tbody>
                    <tr class="tr1">
                        <td class="rldatee daslist"></td>
                        <td class="rltitle daslist">&nbsp;&nbsp;&nbsp;&nbsp;课程信息查询</td>
                    </tr>
                    <tr class="tr1">
                        <td class="rldatee daslist">信息标题：</td>
                        <td class="rltitle dotlist"><input type="text" size="30" name="word" required /></td>
                    </tr>
                    <tr class="tr1">
                        <td class="rldatee daslist"></td>
                        <td class="rltitle daslist"><input type="submit" value="确定提交" style="width:80px;"/> </td>
                    </tr>
                    </tbody>
                </table>
            </FORM>
             
            
            <FORM name="form4" method="post" action="<%=basePath %>szy.jsp">
                <table width="100%" border="0" align="center" cellpadding="4" cellspacing="0" class="rtable">
                    <tbody>
                    <tr class="tr1">
                        <td class="rldatee daslist"></td>
                        <td class="rltitle daslist">&nbsp;&nbsp;&nbsp;&nbsp;课程实验查询</td>
                    </tr>
                    <tr class="tr1">
                        <td class="rldatee daslist">实验标题：</td>
                        <td class="rltitle dotlist"><input type="text" size="30" name="word" required /></td>
                    </tr>
                    <tr class="tr1">
                        <td class="rldatee daslist"></td>
                        <td class="rltitle daslist"><input type="submit" value="确定提交" style="width:80px;"/> </td>
                    </tr>
                    </tbody>
                </table>
            </FORM>
        </div>
    </div>
</div>
<%@ include file="iframe/foot.jsp"%>