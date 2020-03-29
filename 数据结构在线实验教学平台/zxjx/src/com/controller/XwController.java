package com.controller;
/**
 * 接收资讯页面请求，处理和转发
 */

import com.pojo.Xw;
import com.service.XwService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Controller
@RequestMapping("/xw")
public class XwController {
    String date=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    String date2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());

    @Autowired
    @Qualifier("xwServiceImpl")
    private XwService xwService;

    @RequestMapping("/addMethod") //增加
    public String addMethod(HttpServletRequest request, Xw xw) throws Exception {
        String method = request.getParameter("method");
        xw.setSj(date);
        if(method.equals("addxw")){
            int flag = xwService.insertSelective(xw);
            if(flag==1){
                request.setAttribute("message", "操作成功！");
                return "admin/xw/index";
            }
            else{
                request.setAttribute("message", "操作失败！");
                return "admin/xw/index";
            }
        }
        else {//修改
            int flag = xwService.updateByPrimaryKeySelective(xw);
            if(flag==1){
                request.setAttribute("message", "操作成功！");
                return "admin/xw/index";
            }
            else{
                request.setAttribute("message", "操作失败！");
                return "admin/xw/index";
            }
        }
    }
    @RequestMapping("/del/{id}") //删除
    public String deleteMethod(HttpServletRequest request, @PathVariable("id") int id) {
        int flag = xwService.deleteByPrimaryKey(id);
        if(flag==1){
            request.setAttribute("message", "操作成功！");
            return "admin/xw/index";
        }
        else{
            request.setAttribute("message", "操作失败！");
            return "admin/xw/index";
        }
    }
}
