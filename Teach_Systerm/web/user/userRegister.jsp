<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2020/2/3
  Time: 7:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="../../content/css/login.css">
    <link rel="shortcut icon" href="../../favicon.ico" type="image/x-icon" />
    <title>欢迎注册</title>
</head>

<body class="login_bj" >
<div class="zhuce_body">
    <div class="zhuce_kong">
        <div class="zc">
            <div class="bj_bai">
                <h3>欢迎注册</h3>
                <form action="${pageContext.request.contextPath}/UserRegisterServlet?op=register" method="post">
                    <input name="userName" type="text" class="kuang_txt phone" placeholder="用户名">
                    <input name="password" type="password" class="kuang_txt possword" placeholder="密码">
                    <input name="mobile" type="text" class="kuang_txt possword" placeholder="手机号">
                    <input name="email" type="text" class="kuang_txt email" placeholder="邮箱">
                    <input name="identifyingCode" type="text" class="kuang_txt yanzm" placeholder="验证码">

                    <div>
                        <div class="hui_kuang"><img src="../../content/images/login/zc_22.jpg" width="92" height="31"></div>
                        <div class="shuaxin"><a href="#"><img src="../../content/images/login/zc_25.jpg" width="13" height="14"></a></div>
                    </div>
                    <div>
                        <input name="" type="checkbox" value=""><span>已阅读并同意<a href="#" target="_blank"><span class="lan">《XXXXX使用协议》</span></a></span>
                    </div>
                    <input name="注册" type="submit" class="btn_zhuce" value="注册">

                </form>
            </div>
            <div class="bj_right">
                <p>使用以下账号直接登录</p>
                <a href="#" class="zhuce_qq">QQ注册</a>
                <a href="#" class="zhuce_wb">微博注册</a>
                <a href="#" class="zhuce_wx">微信注册</a>
                <p>已有账号？<a href="userLogin.jsp">立即登录</a></p>

            </div>
        </div>
    </div>
</div>

</body>
</html>
