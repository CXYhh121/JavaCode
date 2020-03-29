package com.controller;
/**
 * 上传文件工具类 基于smartupload组件实现
 */

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.ComBean;
import com.bean.Constant;
import com.jspsmart.upload.File;
import com.jspsmart.upload.SmartUpload;

@WebServlet("/UpController")
public class UpController extends HttpServlet {

    private ServletConfig config;
    /**
     * Constructor of the object.
     */
    public UpController() {
        super();
    }

    final public void init(ServletConfig config) throws ServletException
    {
        this.config = config;
    }

    final public ServletConfig getServletConfig()
    {
        return config;
    }
    /**
     * Destruction of the servlet. <br>
     */
    public void destroy() {
        super.destroy(); // Just puts "destroy" string in log
        // Put your code here
    }

    /**
     * The doGet method of the servlet. <br>
     *
     * This method is called when a form has its tag value method equals to get.
     *
     * @param request the request send by the client to the server
     * @param response the response send by the server to the client
     * @throws ServletException if an error occurred
     * @throws IOException if an error occurred
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request,response);
    }

    /**
     * The doPost method of the servlet. <br>
     *
     * This method is called when a form has its tag value method equals to post.
     *
     * @param request the request send by the client to the server
     * @param response the response send by the server to the client
     * @throws ServletException if an error occurred
     * @throws IOException if an error occurred
     */
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        request.setCharacterEncoding("gb2312");
        String date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
        String date2=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String method = "";;
        ComBean cb = new ComBean();
        SmartUpload mySmartUpload = new SmartUpload();//init
        int count = 0;
        HttpSession session = request.getSession();
        try{
            mySmartUpload.initialize(config,request,response);
            mySmartUpload.upload();
            method = mySmartUpload.getRequest().getParameter("method").trim();
            if(method.equals("addkc")){// 上传
                String js = (String)session.getAttribute("user") ;
                String bt = mySmartUpload.getRequest().getParameter("bt");
                String fl = mySmartUpload.getRequest().getParameter("fl");
                String nr = mySmartUpload.getRequest().getParameter("nr");
                if(nr==null||nr.equals(""))nr="暂无";
                File file = mySmartUpload.getFiles().getFile(0);
                String fileExt=file.getFileExt();
                String path="pic";
                count = mySmartUpload.save(path);
                String savepath = path+"/" + sdf.format(new Date())+"."+file.getFileExt();
                file.saveAs(savepath);
                int flag=cb.comUp("insert into kc(bt,fl,url,nr,sj,js) values('"+bt+"','"+fl+"','"+savepath+"','"+nr+"','"+date2+"','"+js+"')");
                if(flag == Constant.SUCCESS){
                    request.setAttribute("message", "操作成功！");
                    request.getRequestDispatcher("admin/kc/index.jsp").forward(request, response);
                }
                else {
                    request.setAttribute("message", "操作失败！");
                    request.getRequestDispatcher("admin/kc/index.jsp").forward(request, response);
                }
            }
            else if(method.equals("upkc")){//修改
                String id = mySmartUpload.getRequest().getParameter("id");
                String bt = mySmartUpload.getRequest().getParameter("bt");
                String fl = mySmartUpload.getRequest().getParameter("fl");
                String nr = mySmartUpload.getRequest().getParameter("nr");
                File file = mySmartUpload.getFiles().getFile(0);
                String fileExt=file.getFileExt();
                String path="pic";
                count = mySmartUpload.save(path);
                if(count==0){
                    int flag=cb.comUp("update kc set bt='"+bt+"',fl='"+fl+"',nr='"+nr+"' where id='"+id+"'");
                    if(flag == Constant.SUCCESS){
                        request.setAttribute("message", "操作成功！");
                        request.getRequestDispatcher("admin/kc/index.jsp").forward(request, response);
                    }
                    else {
                        request.setAttribute("message", "操作失败！");
                        request.getRequestDispatcher("admin/kc/index.jsp").forward(request, response);
                    }
                }
                else{
                    String savepath = path+"/" + sdf.format(new Date())+"."+file.getFileExt();
                    file.saveAs(savepath);
                    int flag = cb.comUp("update kc set bt='"+bt+"',fl='"+fl+"',url='"+savepath+"',nr='"+nr+"' where id='"+id+"' ");
                    if(flag == Constant.SUCCESS){
                        request.setAttribute("message", "操作成功！");
                        request.getRequestDispatcher("admin/kc/index.jsp").forward(request, response);
                    }
                    else {
                        request.setAttribute("message", "操作失败！");
                        request.getRequestDispatcher("admin/kc/index.jsp").forward(request, response);
                    }
                }
            }

            else if(method.equals("addvd")){// 上传
                String js = (String)session.getAttribute("user") ;
                String bt = mySmartUpload.getRequest().getParameter("bt");
                String fl = mySmartUpload.getRequest().getParameter("fl");
                String nr = mySmartUpload.getRequest().getParameter("nr");
                if(nr==null||nr.equals(""))nr="暂无";
                File file = mySmartUpload.getFiles().getFile(0);
                String fileExt=file.getFileExt();
                String path="pic";
                count = mySmartUpload.save(path);
                String savepath = path+"/" + sdf.format(new Date())+"."+file.getFileExt();
                file.saveAs(savepath);
                int flag=cb.comUp("insert into vd(bt,fl,url,nr,sj,js) values('"+bt+"','"+fl+"','"+savepath+"','"+nr+"','"+date2+"','"+js+"')");
                if(flag == Constant.SUCCESS){
                    request.setAttribute("message", "操作成功！");
                    request.getRequestDispatcher("admin/vd/index.jsp").forward(request, response);
                }
                else {
                    request.setAttribute("message", "操作失败！");
                    request.getRequestDispatcher("admin/vd/index.jsp").forward(request, response);
                }
            }
            else if(method.equals("upvd")){//修改
                String id = mySmartUpload.getRequest().getParameter("id");
                String bt = mySmartUpload.getRequest().getParameter("bt");
                String fl = mySmartUpload.getRequest().getParameter("fl");
                String nr = mySmartUpload.getRequest().getParameter("nr");
                File file = mySmartUpload.getFiles().getFile(0);
                String fileExt=file.getFileExt();
                String path="pic";
                count = mySmartUpload.save(path);
                if(count==0){
                    int flag=cb.comUp("update vd set bt='"+bt+"',fl='"+fl+"',nr='"+nr+"' where id='"+id+"'");
                    if(flag == Constant.SUCCESS){
                        request.setAttribute("message", "操作成功！");
                        request.getRequestDispatcher("admin/vd/index.jsp").forward(request, response);
                    }
                    else {
                        request.setAttribute("message", "操作失败！");
                        request.getRequestDispatcher("admin/vd/index.jsp").forward(request, response);
                    }
                }
                else{
                    String savepath = path+"/" + sdf.format(new Date())+"."+file.getFileExt();
                    file.saveAs(savepath);
                    int flag = cb.comUp("update vd set bt='"+bt+"',fl='"+fl+"',url='"+savepath+"',nr='"+nr+"' where id='"+id+"' ");
                    if(flag == Constant.SUCCESS){
                        request.setAttribute("message", "操作成功！");
                        request.getRequestDispatcher("admin/vd/index.jsp").forward(request, response);
                    }
                    else {
                        request.setAttribute("message", "操作失败！");
                        request.getRequestDispatcher("admin/vd/index.jsp").forward(request, response);
                    }
                }
            }

            else if(method.equals("addzl")){// 上传
                String js = (String)session.getAttribute("user") ;
                String bt = mySmartUpload.getRequest().getParameter("bt");
                String fl = mySmartUpload.getRequest().getParameter("fl");
                String nr = mySmartUpload.getRequest().getParameter("nr");
                if(nr==null||nr.equals(""))nr="暂无";
                File file = mySmartUpload.getFiles().getFile(0);
                String fileExt=file.getFileExt();
                String path="pic";
                count = mySmartUpload.save(path);
                String savepath = path+"/" + sdf.format(new Date())+"."+file.getFileExt();
                file.saveAs(savepath);
                int flag=cb.comUp("insert into zl(bt,fl,url,nr,sj,js) values('"+bt+"','"+fl+"','"+savepath+"','"+nr+"','"+date2+"','"+js+"')");
                if(flag == Constant.SUCCESS){
                    request.setAttribute("message", "操作成功！");
                    request.getRequestDispatcher("admin/zl/index.jsp").forward(request, response);
                }
                else {
                    request.setAttribute("message", "操作失败！");
                    request.getRequestDispatcher("admin/zl/index.jsp").forward(request, response);
                }
            }
            else if(method.equals("upzl")){//修改
                String id = mySmartUpload.getRequest().getParameter("id");
                String bt = mySmartUpload.getRequest().getParameter("bt");
                String fl = mySmartUpload.getRequest().getParameter("fl");
                String nr = mySmartUpload.getRequest().getParameter("nr");
                File file = mySmartUpload.getFiles().getFile(0);
                String fileExt=file.getFileExt();
                String path="pic";
                count = mySmartUpload.save(path);
                if(count==0){
                    int flag=cb.comUp("update zl set bt='"+bt+"',fl='"+fl+"',nr='"+nr+"' where id='"+id+"'");
                    if(flag == Constant.SUCCESS){
                        request.setAttribute("message", "操作成功！");
                        request.getRequestDispatcher("admin/zl/index.jsp").forward(request, response);
                    }
                    else {
                        request.setAttribute("message", "操作失败！");
                        request.getRequestDispatcher("admin/zl/index.jsp").forward(request, response);
                    }
                }
                else{
                    String savepath = path+"/" + sdf.format(new Date())+"."+file.getFileExt();
                    file.saveAs(savepath);
                    int flag = cb.comUp("update zl set bt='"+bt+"',fl='"+fl+"',url='"+savepath+"',nr='"+nr+"' where id='"+id+"' ");
                    if(flag == Constant.SUCCESS){
                        request.setAttribute("message", "操作成功！");
                        request.getRequestDispatcher("admin/zl/index.jsp").forward(request, response);
                    }
                    else {
                        request.setAttribute("message", "操作失败！");
                        request.getRequestDispatcher("admin/zl/index.jsp").forward(request, response);
                    }
                }
            }

            else if(method.equals("addzy")){// 上传
                String js = (String)session.getAttribute("user") ;
                String bt = mySmartUpload.getRequest().getParameter("bt");
                String fl = mySmartUpload.getRequest().getParameter("fl");
                String nr = mySmartUpload.getRequest().getParameter("nr");
                if(nr==null||nr.equals(""))nr="暂无";
                File file = mySmartUpload.getFiles().getFile(0);
                String fileExt=file.getFileExt();
                String path="pic";
                count = mySmartUpload.save(path);
                String savepath = path+"/" + sdf.format(new Date())+"."+file.getFileExt();
                file.saveAs(savepath);
                int flag=cb.comUp("insert into zy(bt,fl,url,nr,sj,js) values('"+bt+"','"+fl+"','"+savepath+"','"+nr+"','"+date2+"','"+js+"')");
                if(flag == Constant.SUCCESS){
                    request.setAttribute("message", "操作成功！");
                    request.getRequestDispatcher("admin/zy/index.jsp").forward(request, response);
                }
                else {
                    request.setAttribute("message", "操作失败！");
                    request.getRequestDispatcher("admin/zy/index.jsp").forward(request, response);
                }
            }
            else if(method.equals("upzy")){//修改
                String id = mySmartUpload.getRequest().getParameter("id");
                String bt = mySmartUpload.getRequest().getParameter("bt");
                String fl = mySmartUpload.getRequest().getParameter("fl");
                String nr = mySmartUpload.getRequest().getParameter("nr");
                File file = mySmartUpload.getFiles().getFile(0);
                String fileExt=file.getFileExt();
                String path="pic";
                count = mySmartUpload.save(path);
                if(count==0){
                    int flag=cb.comUp("update zy set bt='"+bt+"',fl='"+fl+"',nr='"+nr+"' where id='"+id+"'");
                    if(flag == Constant.SUCCESS){
                        request.setAttribute("message", "操作成功！");
                        request.getRequestDispatcher("admin/zy/index.jsp").forward(request, response);
                    }
                    else {
                        request.setAttribute("message", "操作失败！");
                        request.getRequestDispatcher("admin/zy/index.jsp").forward(request, response);
                    }
                }
                else{
                    String savepath = path+"/" + sdf.format(new Date())+"."+file.getFileExt();
                    file.saveAs(savepath);
                    int flag = cb.comUp("update zy set bt='"+bt+"',fl='"+fl+"',url='"+savepath+"',nr='"+nr+"' where id='"+id+"' ");
                    if(flag == Constant.SUCCESS){
                        request.setAttribute("message", "操作成功！");
                        request.getRequestDispatcher("admin/zy/index.jsp").forward(request, response);
                    }
                    else {
                        request.setAttribute("message", "操作失败！");
                        request.getRequestDispatcher("admin/zy/index.jsp").forward(request, response);
                    }
                }
            }

            else if(method.equals("sjzy")){//上交实验
                String member = (String)session.getAttribute("member");
                String zyid = mySmartUpload.getRequest().getParameter("id");
                String mc = cb.getString("select bt from zy where id='"+zyid+"'");
                File file = mySmartUpload.getFiles().getFile(0);
                String fileExt=file.getFileExt();
                String path="pic";
                count = mySmartUpload.save(path);
                String savepath = path+"/" + sdf.format(new Date())+"."+file.getFileExt();
                file.saveAs(savepath);
                String js = cb.getString("select js from zy where id='"+zyid+"'");
                String str=cb.getString("select id from sj where zyid='"+zyid+"' and member='"+member+"'");
                if(str==null){
                    int flag=cb.comUp("insert into sj(zyid,mc,url,member,js) values('"+zyid+"','"+mc+"','"+savepath+"','"+member+"','"+js+"')");
                    if(flag == Constant.SUCCESS){
                        request.setAttribute("message", "操作成功！");
                        request.getRequestDispatcher("zy.jsp").forward(request, response);
                    }
                    else {
                        request.setAttribute("message", "操作失败！");
                        request.getRequestDispatcher("zy.jsp").forward(request, response);
                    }
                }
                else {
                    request.setAttribute("message", "不要重复提交！");
                    request.getRequestDispatcher("zy.jsp").forward(request, response);
                }
            }

            else if(method.equals("uptx")){//修改头像
                String member = (String)session.getAttribute("member");
                File file = mySmartUpload.getFiles().getFile(0);
                String fileExt=file.getFileExt();
                String path="pic";
                count = mySmartUpload.save(path);
                String savepath = path+"/" + sdf.format(new Date())+"."+file.getFileExt();
                file.saveAs(savepath);
                int flag = cb.comUp("update member set tx='"+savepath+"' where username='"+member+"' ");
                if(flag == Constant.SUCCESS){
                    request.setAttribute("message", "操作成功！");
                    request.getRequestDispatcher("member/info/tx.jsp").forward(request, response);
                }
                else {
                    request.setAttribute("message", "操作失败！");
                    request.getRequestDispatcher("member/info/tx.jsp").forward(request, response);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    /**
     * Initialization of the servlet. <br>
     *
     * @throws ServletException if an error occure
     */
    public void init() throws ServletException {
        // Put your code here
    }

}
