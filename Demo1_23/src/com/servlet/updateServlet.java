package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dao.UserDaoImplement;
import entity.MyUser;

public class updateServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException {
        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException {

        String id = request.getParameter("id");

        String name = request.getParameter("name"); //获取jsp页面传过来的参数

        UserDao ud = new UserDaoImplement();

        if(ud.update(name, id)){
            request.getRequestDispatcher("/addUpdateDeleteSuccess.jsp").forward(request, response);
        }else{
            response.sendRedirect("addUpdateDeleteFail.jsp");
        }
    }
}

