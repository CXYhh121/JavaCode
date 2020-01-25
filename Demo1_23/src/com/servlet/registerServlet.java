package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.*;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.UserDao;
import dao.UserDaoImplement;
import entity.MyUser;

public class registerServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException {
        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException {

        String name = request.getParameter("name"); //获取jsp页面传过来的参数
        String pwd = request.getParameter("password");
        String id = request.getParameter("id");

        MyUser user = new MyUser(); //实例化一个对象，组装属性
        user.setName(name);
        user.setPassword(pwd);
        user.setId(id);

        UserDao ud = new UserDaoImplement();

        if(ud.register(user)){
            request.setAttribute("name", name);  //向request域中放置参数
            request.getRequestDispatcher("/login.jsp").forward(request, response);  //转发到登录页面
        }else{
            response.sendRedirect("register.jsp");//注册失败则返回注册页面，但是缺少提示"注册失败"
        }
    }
}
