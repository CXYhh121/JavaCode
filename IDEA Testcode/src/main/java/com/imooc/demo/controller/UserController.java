package com.imooc.demo.controller;

import com.imooc.demo.config.Application;
import com.imooc.demo.dto.UserDto;
import com.imooc.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public String login(UserDto userDto) {
        LOG.info("登录开始, {}", userDto.toString());

        Map<String, String> map = new HashMap<>();
        map.put("", "");
        map.put("", "");
        map.put("", "");
        map.put("", "");

        // todo 调用service方法
        userDto = userService.doLogin(userDto);

        if (userDto == null) {
            LOG.warn("用户或密码错");
            return "用户或密码错";
        } else {
            LOG.info("登录成功");
            return "登录成功";
        }
    }

    @RequestMapping("/list")
    public String list() {
        LOG.info("查询开始");
        userService.list();
        return "success";
    }

}