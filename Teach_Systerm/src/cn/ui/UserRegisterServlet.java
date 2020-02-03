package cn.ui;

import cn.bll.UserRegisterBll;
import cn.bll.UserRegisterBllImp;
import cn.domain.UserRegisterDomain;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class UserRegisterServlet
 */
@WebServlet("/UserRegisterServlet")
public class UserRegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserRegisterBll bll = new UserRegisterBllImp();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String op = request.getParameter("op").toString();
        if("register".equals(op)) {
            this.userRegister(request,response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }

    void userRegister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("GBK"); //解决输出提示框乱码问题(js和servlet编码不统一导致的）

        //注册功能--拿到前端页面提交的数据 bll-dao-DBConnection
        String userName = request.getParameter("userName").trim().toString();
        String password = request.getParameter("password").trim().toString();
        String mobile = request.getParameter("mobile").trim().toString();
        String email = request.getParameter("email").trim().toString();

        //业务层-数据访问层-DBConnection
        PrintWriter out=response.getWriter();
        if(bll.userRegister(new UserRegisterDomain(0, userName, password, mobile, email)) != null){
            //重定向
            /*response.sendRedirect("pages/user/userLogin.jsp");*/
            out.print("<script>alert('注册成功!');window.location.href='pages/user/userLogin.jsp'</script>");

        }
        else
            out.write("<script language='javascript'>alert('格式不正确请重新注册！！！')</script>");

        //转发
        /*request.getRequestDispatcher("pages/user/userLogin.jsp").forward(request, response);*/
    }

}