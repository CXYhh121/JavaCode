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
            <FORM name="form1" method="post" action="<%=basePath%>member/addMember">
                <table width="100%" border="0" align="center" cellpadding="4" cellspacing="0" class="rtable">
                    <tbody>
                    <tr class="tr1">
                        <td class="rldatee daslist"></td>
                        <td class="rltitle daslist">&nbsp;&nbsp;&nbsp;&nbsp;学生注册</td>
                    </tr>
                    <tr class="tr1">
                        <td class="rldatee daslist">登录帐号：</td>
                        <td class="rltitle dotlist"><input type="text" size="30" name="username" required /></td>
                    </tr>
                    <tr class="tr1">
                        <td class="rldatee daslist">登录密码：</td>
                        <td class="rltitle dotlist"><input type="password" size="30" name="password" required /></td>
                    </tr>
                    <tr class="tr1">
                        <td class="rldatee daslist">用户姓名：</td>
                        <td class="rltitle dotlist"><input type="text" size="30" name="realname" required /></td>
                    </tr>
                    <tr class="tr1">
                        <td class="rldatee daslist">用户性别：</td>
                        <td class="rltitle dotlist"><input type="radio" name="sex" value="男" checked /> 男 <input type="radio" name="sex" value="女"/> 女</td>
                    </tr>
                    <tr class="tr1">
                        <td class="rldatee daslist">用户年龄：</td>
                        <td class="rltitle dotlist"><input type="number" size="30" name="sfz" min="18" max="100" required /></td>
                    </tr>
                    <tr class="tr1">
                        <td class="rldatee daslist">联系电话：</td>
                        <td class="rltitle dotlist"><input type="text" size="30" name="tel" pattern="[0-9]{11}" title="11位手机号码" required /></td>
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