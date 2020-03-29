package com.controller;
/**
 * 接收留言页面数据 处理 转发
 */

import com.pojo.Ly;
import com.service.LyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Controller
@RequestMapping("/ly")
public class LyController {
    String date=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    String date2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
    @Autowired
    private LyService lyService;

    @RequestMapping("/addMethod") //增加
    public String addMethod(HttpServletRequest request, Ly ly) throws Exception {
        HttpSession session = request.getSession();
        String member = (String)session.getAttribute("member");
        ly.setMember(member);
        ly.setSj(date);
        int flag = lyService.insertSelective(ly);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "ly";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "ly";
        }
    }
    @RequestMapping("/upMethod") //回复
    public String upMethod(HttpServletRequest request, Ly ly) throws Exception {
        HttpSession session = request.getSession();
        String hfr = (String)session.getAttribute("user");
        ly.setHfr(hfr);
        ly.setHfsj(date);
        int flag = lyService.updateByPrimaryKeySelective(ly);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/ly/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/ly/index";
        }
    }
    @RequestMapping("/del/{id}") //删除
    public String deleteMethod(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = lyService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/ly/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/ly/index";
        }
    }
    @RequestMapping("batchDel") //批量删除
    public String batchDel(HttpServletRequest request) {
        String chk_list[] = request.getParameterValues("chk_list");
        for(int i=0;i<chk_list.length;i++){
            lyService.deleteByPrimaryKey(Integer.parseInt(chk_list[i]));
        }
        request.setAttribute("message", "操作成功！");
        return "admin/ly/index";
    }
}
