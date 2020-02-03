package cn.dal;

import cn.domain.UserRegisterDomain;
import cn.util.DBConnection;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserRegisterDaoImp implements UserRegisterDao {
    private Connection connection = DBConnection.getConnection();
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private String sql = "";

    public UserRegisterDomain userRegister(UserRegisterDomain user) {
        sql = "INSERT INTO tb_register(userName, password, mobile, email)"
                  + "VALUES(?, ?, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getMobile());
            preparedStatement.setString(4, user.getEmail());

            if (preparedStatement.executeUpdate() > 0)
                return user;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Test
    public void test0() {
        UserRegisterDao dao = new UserRegisterDaoImp();
        UserRegisterDomain user = dao.userRegister(
                  new UserRegisterDomain(0, "xie", "8888", "987654321", "163@com"));
        System.out.println(user);
    }

}