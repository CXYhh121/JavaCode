package cn.dal;

import cn.domain.UserRegisterDomain;

public interface UserRegisterDao {
    UserRegisterDomain userRegister(UserRegisterDomain user);
}