package com.controller;
/**
 * 课程信息数据接收 处理 转发
 */

import com.pojo.Kc;
import com.service.KcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Controller
@RequestMapping("/kc")
public class KcController {
    String date=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());

    @Autowired
    private KcService kcService;

    @RequestMapping("/addMethod") //增加
    public String addMethod(HttpServletRequest request, Kc kc) throws Exception {
        String method = request.getParameter("method");
        kc.setSj(date);
        if(method.equals("addkc")){
            int flag = kcService.insertSelective(kc);
            if(flag==1){
                request.setAttribute("message", "操作成功！");
                return "admin/kc/index";
            }
            else{
                request.setAttribute("message", "操作失败！");
                return "admin/kc/index";
            }
        }
        else {//修改
            int flag = kcService.updateByPrimaryKeySelective(kc);
            if(flag==1){
                request.setAttribute("message", "操作成功！");
                return "admin/kc/index";
            }
            else{
                request.setAttribute("message", "操作失败！");
                return "admin/kc/index";
            }
        }
    }
    @RequestMapping("/del/{id}") //删除
    public String deleteMethod(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = kcService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/kc/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/kc/index";
        }
    }
    @RequestMapping("batchDel") //批量删除
    public String batchDel(HttpServletRequest request) {
        String chk_list[] = request.getParameterValues("chk_list");
        for(int i=0;i<chk_list.length;i++){
            kcService.deleteByPrimaryKey(Integer.parseInt(chk_list[i]));
        }
        request.setAttribute("message", "操作成功！");
        return "admin/kc/index";
    }
}
