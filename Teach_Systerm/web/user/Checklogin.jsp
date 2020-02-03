<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2020/2/3
  Time: 7:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    z
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<%@ page import="cn.util.DBConnection, java.sql.SQLException,
	java.sql.Connection,java.sql.ResultSet,java.sql.PreparedStatement "%>
<%
    //解决从数据库取数据时候乱码问题（全英文可以登录但中文无法登录）
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");

    String username = request.getParameter("username").toString();
    String password = request.getParameter("password").toString();
    Connection connection = DBConnection.getConnection();
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String sql = "";

    try {
        if (connection != null) {
            sql = "select * from tb_register where username='" + username + "' and password='" + password + "'";
            preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery(sql);
            if (resultSet.next()) {
                //重定向--密码正确跳转到主页
                response.sendRedirect("../../index.jsp");

            } else {
                //密码或者用户名输错--刷新原来页面重新输入
                out.print("<script type='text/javascript'>alert('您输入的用户名或者密码有错误，请核实后重新输入！');</script>");
                out.print("<script type='text/javascript'>location.href='userLogin.jsp'</script>");
                /* 重定向 */
                /* response.sendRedirect("../login.jsp"); */
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
%>

</body>
</html>
