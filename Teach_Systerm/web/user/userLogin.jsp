<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2020/2/3
  Time: 7:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="../login.css">
    <link rel="shortcut icon" href="../../favicon.ico" type="image/x-icon" />
    <title>欢迎登录</title>
</head>
<body class="login_bj">
<!-- <h1 style="font-size: 2em; text-align: center; margin-top: 30px;">用户登陆</h1> -->
<div class="zhuce_body">
    <div class="zhuce_kong login_kuang">
        <div class="zc">
            <div class="bj_bai">
                <h3 style="margin-left: 30%;">欢迎登录</h3>
                <form action="Checklogin.jsp" method="post">
                    <label>用户名:</label>
                    <input name="username" type="text" class="kuang_txt" placeholder="用户名"><br>
                    <label>密码：</label>
                    <input name="password" type="password" class="kuang_txt" placeholder="密码"><br><br>

                    <input  name="登录" type="submit" class="btn_zhuce" value="登录">
                </form>
            </div>

            <div class="bj_right">
                <p>使用以下账号直接登录</p>
                <a target="_blank" href="http://web2.qq.com/" class="zhuce_qq">QQ注册</a>
                <a target="_blank" href="https://weibo.com/" class="zhuce_wb">微博注册</a>
                <a target="_blank" href="https://wx.qq.com/" class="zhuce_wx">微信注册</a>
                <p>已有账号？<a href="#">立即登录</a></p>
            </div>

        </div>
    </div>
</div>
</body>
</html>