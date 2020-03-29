package com.controller;
/**
 * 课件资源数据接收 处理 转发
 */
import com.pojo.Zl;
import com.service.ZlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Controller
@RequestMapping("/zl")
public class ZlController {
    String date=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());

    @Autowired
    private ZlService zlService;

    @RequestMapping("/addMethod") //增加
    public String addMethod(HttpServletRequest request, Zl zl) throws Exception {
        String method = request.getParameter("method");
        zl.setSj(date);
        if(method.equals("addzl")){
            int flag = zlService.insertSelective(zl);
            if(flag==1){
                request.setAttribute("message", "操作成功！");
                return "admin/zl/index";
            }
            else{
                request.setAttribute("message", "操作失败！");
                return "admin/zl/index";
            }
        }
        else {//修改
            int flag = zlService.updateByPrimaryKeySelective(zl);
            if(flag==1){
                request.setAttribute("message", "操作成功！");
                return "admin/zl/index";
            }
            else{
                request.setAttribute("message", "操作失败！");
                return "admin/zl/index";
            }
        }
    }
    @RequestMapping("/del/{id}") //删除
    public String deleteMethod(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = zlService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/zl/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/zl/index";
        }
    }
    @RequestMapping("batchDel") //批量删除
    public String batchDel(HttpServletRequest request) {
        String chk_list[] = request.getParameterValues("chk_list");
        for(int i=0;i<chk_list.length;i++){
            zlService.deleteByPrimaryKey(Integer.parseInt(chk_list[i]));
        }
        request.setAttribute("message", "操作成功！");
        return "admin/zl/index";
    }
}
