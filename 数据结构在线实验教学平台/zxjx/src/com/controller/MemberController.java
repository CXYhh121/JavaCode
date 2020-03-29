package com.controller;
/**
 * 接收注册用户页面请求，处理和转发
 */


import com.pojo.Member;
import com.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberController {
    String date=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    String date2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());

    @Autowired
    @Qualifier("memberServiceImpl")
    private MemberService memberService;

    @RequestMapping("/toUser")
    public String list(HttpServletRequest request) {
        request.removeAttribute("message");
        return "index";
    }

    @RequestMapping("/addMember") //前台用户注册
    public String addMember(HttpServletRequest request, Member member) {
        String username=member.getUsername();
        String str = memberService.getSame(username);
        if(username.equals("admin")){
            request.setAttribute("message", "非法用户名！");
            return "reg";
        }
        else{
            if(str==null) {
                member.setRegtime(date);
                int flag = memberService.insert(member);
                if(flag==1){
                    request.setAttribute("message", "注册成功请登录！");
                    return "login";
                }
                else{
                    request.setAttribute("message", "操作失败！");
                    return "reg";
                }
            }
            else{
                request.setAttribute("message", "账号重复！");
                return "reg";
            }
        }
    }
    @RequestMapping("toLogin") //注册用户登录
    public String toLogin(HttpServletRequest request, Member member) {
        HttpSession session = request.getSession();
        member.setIfuse("在用");
        List<Member> list = memberService.toLogin(member);
        if(list.size()>0){
            session.setAttribute("member",member.getUsername());
            request.setAttribute("message", "登录成功！");
            return "index";
        }
        else{
            request.setAttribute("message", "登录信息错误！");
            return "login";
        }
    }
    @RequestMapping("/toExit") //注册用户退出登录
    public String toExit(HttpServletRequest request){
        HttpSession session = request.getSession();
        String member =(String)session.getAttribute("member");
        session.removeAttribute("member");
        return "index";
    }
    @RequestMapping("/upMember") //注册用户修改资料
    public String UpMember(HttpServletRequest request, Member member) {
        HttpSession session = request.getSession();
        String username = (String)session.getAttribute("member");
        member.setUsername(username);
        int flag = memberService.upMember(member);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "member/info/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "member/info/index";
        }
    }
    @RequestMapping("/memberupPwd") //注册用户修改密码
    public String memberupPwd(HttpServletRequest request,Member member) {
        HttpSession session = request.getSession();
        String username = (String)session.getAttribute("member");
        String oldpwd = request.getParameter("oldpwd");
        String newpwd = request.getParameter("newpwd");
        member.setUsername(username);
        member.setPassword(oldpwd);
        List<Member> list = memberService.memberPwd(member);
        if(list.size()>0){
            member.setPassword(newpwd);
            int flag = memberService.memberupPwd(member);
            if(flag==1){
                request.setAttribute("message", "操作成功！");
                return "member/info/pwd";
            }
            else{
                request.setAttribute("message", "操作失败！");
                return "member/info/pwd";
            }
        }
        else{
            request.setAttribute("message", "原始密码错误！");
            return "member/info/pwd";
        }
    }
    @RequestMapping("toLost") //找回密码
    public String toLost(HttpServletRequest request, Member member) {
        member.setIfuse("在用");
        List<Member> list = memberService.toLost(member);
        if(list.size()>0){
            member.setPassword("111");
            int flag = memberService.memberupPwd(member);
            if(flag==1){
                request.setAttribute("message", "新密码为111，请登录后修改！");
                return "login";
            }
            else{
                request.setAttribute("message", "操作失败！");
                return "lost";
            }
        }
        else{
            request.setAttribute("message", "信息错误！");
            return "lost";
        }
    }

    @RequestMapping("/upifuse/{id}") //管理注册用户
    public String upIfuse(HttpServletRequest request,@PathVariable("id") int id) {
        Member member = memberService.selectByPrimaryKey(id);
        String ifuse = member.getIfuse();
        if(ifuse.equals("在用"))
            member.setIfuse("停用");
        else
            member.setIfuse("在用");
        int flag = memberService.updateIfuse(member);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/member/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/member/index";
        }
    }
    @RequestMapping("/del/{id}") //管理员删除注册用户
    public String deletemember(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = memberService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/member/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/member/index";
        }
    }
}
