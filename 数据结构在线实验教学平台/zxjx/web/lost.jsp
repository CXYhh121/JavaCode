<%@ page language="java" import="java.util.*"  contentType="text/html;charset=UTF-8" %>
<%@ include file="iframe/head.jsp" %> 

<SCRIPT language=javascript>
    function login() {
        window.location="<%=basePath%>login.jsp";
    }
</SCRIPT>

<div class="main">
    <div class="narea"><div>
        <img height="326" src="<%=basePath%>images/zgm.jpg" width="1020">
    </div>
    </div>
    <div class="rmain">
        <div class="tom"><div class="totitle"><span> </span></div></div>
        <div class="rlist">
            <FORM name="form1" method="post" action="<%=basePath %>member/toLost">
                <table width="100%" border="0" align="center" cellpadding="4" cellspacing="0" class="rtable">
                    <tbody>
                    <tr class="tr1">
                        <td class="rldatee daslist"></td>
                        <td class="rltitle daslist">&nbsp;&nbsp;&nbsp;&nbsp;找回密码</td>
                    </tr>
                    <tr class="tr1">
                        <td class="rldatee daslist">登录帐号：</td>
                        <td class="rltitle dotlist"><input type="text" size="30" name="username" required /></td>
                    </tr>
                    <tr class="tr1">
                        <td class="rldatee daslist">密保邮箱：</td>
                        <td class="rltitle dotlist"><input type="email" size="30" name="email" required /></td>
                    </tr>
                    <tr class="tr1">
                        <td class="rldatee daslist"></td>
                        <td class="rltitle daslist"><input type="submit" value="确定提交" style="width:80px;"/>
                            <input type="button" value="返回登录" style="width:80px;" onclick="login()"/></td>
                    </tr>
                    </tbody>
                </table>
            </FORM>
        </div>
    </div>
</div>
<%@ include file="iframe/foot.jsp"%>