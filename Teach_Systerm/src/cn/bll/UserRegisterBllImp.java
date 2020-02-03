package cn.bll;


import cn.dal.UserRegisterDao;
import cn.dal.UserRegisterDaoImp;
import cn.domain.UserRegisterDomain;

public class UserRegisterBllImp implements UserRegisterBll {
    private UserRegisterDao dao = new UserRegisterDaoImp();

    public UserRegisterDomain userRegister(UserRegisterDomain user) {
        return dao.userRegister(user);
    }

}
