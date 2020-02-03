package cn.util;

import com.mysql.jdbc.PreparedStatement;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DBConnection {
    private static Connection connection = null;
    private static String className = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/e-bus?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private static String user = "root";
    private static String password = "123456";

    //连接数据库
    public static Connection getConnection() {
        try {
            Class.forName(className); //加载驱动
            connection = DriverManager.getConnection(url, user, password); //创建连接
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    //关闭连接
    public static void Close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
        try {
            if (resultSet != null)
                resultSet.close();
            if (preparedStatement != null)
                preparedStatement.close();
            if (connection != null)
                connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() {
        System.out.println(DBConnection.getConnection());
    }

}
