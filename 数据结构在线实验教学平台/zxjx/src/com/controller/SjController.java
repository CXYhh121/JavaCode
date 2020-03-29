package com.controller;
/**
 * 学生上交实验页面数据接收处理转发
 */

import com.pojo.Sj;
import com.service.SjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/sj")
public class SjController {

    @Autowired
    private SjService sjService;

    @RequestMapping("/toSj")//学生上交实验
    public String toSj(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        HttpSession session = request.getSession();
        String member = (String)session.getAttribute("member");
        if(member==null){
            request.setAttribute("message", "请先登录！");
            return "login";
        }
        else{
            request.setAttribute("id",id);
            return "sj";
        }
    }

    @RequestMapping("/del/{id}") //删除
    public String deleteMethod(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = sjService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "member/sj/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "member/sj/index";
        }
    }

    @RequestMapping("/addMethod") //教师批改实验
    public String addMethod(HttpServletRequest request, Sj sj) throws Exception {
        int flag = sjService.updateByPrimaryKeySelective(sj);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/sj/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/sj/index";
        }
    }
    @RequestMapping("/del2/{id}") //删除
    public String deleteMethod2(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = sjService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/sj/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/sj/index";
        }
    }
}
