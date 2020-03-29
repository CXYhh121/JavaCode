package com.controller;
/**
 * 教师发布实验页面数据接收 处理 转发
 */
import com.pojo.Zy;
import com.service.ZyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Controller
@RequestMapping("/zy")
public class ZyController {
    String date=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());

    @Autowired
    private ZyService zyService;

    @RequestMapping("/addMethod") //增加
    public String addMethod(HttpServletRequest request, Zy zy) throws Exception {
        String method = request.getParameter("method");
        zy.setSj(date);
        if(method.equals("addzy")){
            int flag = zyService.insertSelective(zy);
            if(flag==1){
                request.setAttribute("message", "操作成功！");
                return "admin/zy/index";
            }
            else{
                request.setAttribute("message", "操作失败！");
                return "admin/zy/index";
            }
        }
        else {//修改
            int flag = zyService.updateByPrimaryKeySelective(zy);
            if(flag==1){
                request.setAttribute("message", "操作成功！");
                return "admin/zy/index";
            }
            else{
                request.setAttribute("message", "操作失败！");
                return "admin/zy/index";
            }
        }
    }
    @RequestMapping("/del/{id}") //删除
    public String deleteMethod(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = zyService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/zy/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/zy/index";
        }
    }
    @RequestMapping("batchDel") //批量删除
    public String batchDel(HttpServletRequest request) {
        String chk_list[] = request.getParameterValues("chk_list");
        for(int i=0;i<chk_list.length;i++){
            zyService.deleteByPrimaryKey(Integer.parseInt(chk_list[i]));
        }
        request.setAttribute("message", "操作成功！");
        return "admin/zy/index";
    }
}
