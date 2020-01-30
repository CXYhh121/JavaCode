package com.imooc.demo.service;

import com.imooc.demo.domain.User;
import com.imooc.demo.dto.UserDto;
import com.imooc.demo.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Resource
    private UserMapper userMapper;

    /**
     * 登录功能
     * @param dto
     * @return
     */
        public UserDto doLogin(UserDto dto) {
        List<User> userList = userMapper.findByLoginName(dto.getLoginName());
        if (CollectionUtils.isEmpty(userList)) {
            LOG.info("根据用户名查找不到记录");
            return null;
        } else {
            User user = userList.get(0);
            LOG.info("根据用户名查找结果：{}", user);
            return validatePassword(dto, user);
        }
    }

    private UserDto validatePassword(UserDto userDto, User user) {
        if (userDto.getPassword().equals(user.getPassword())) {
            BeanUtils.copyProperties(user, userDto);
            return userDto;
        } else {
            LOG.warn("密码错：{}，{}", userDto.getPassword(), user.getPassword());
            return null;
        }
    }

    /**
     * @return
     */
    public void list() {
        List<User> userList = userMapper.list();
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (i == 1) {
                throw new NullPointerException();
            }
            System.out.println(user);
        }
    }
}
