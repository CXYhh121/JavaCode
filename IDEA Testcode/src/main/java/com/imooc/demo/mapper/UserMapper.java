package com.imooc.demo.mapper;


import com.imooc.demo.domain.User;

import java.util.List;

public interface UserMapper {

    List<User> findByLoginName(String loginName);

    List<User> list();

}