package com.jdbc.test;

import java.math.BigDecimal;
import java.sql.*;

public class DBConnection {
    //数据库url，username，password
    static final String DB_url = "jdbc:mysql://localhost:3306/book";
    static final String username = "root";
    static final String password = "123456";

    public static void main(String[] args) {
        try {
            //1.注册JDBC驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取数据库连接
            Connection connection = DriverManager.getConnection(DB_url,username,password);
            //3.操作数据库
            Statement statement = connection.createStatement();//获取操作数据库的对象
            String sql = "select * from bookinfo";//定义数据库语句
            ResultSet resultSet = statement.executeQuery(sql);//执行数据库语句获取结果集

            while(resultSet.next()){
                int bookid = resultSet.getInt("book_id");
                String bookname = resultSet.getNString("booK_name");
                BigDecimal price = resultSet.getBigDecimal("price");
                Date publicdate = resultSet.getDate("public_date");
                String store = resultSet.getNString("store");

                System.out.println("图书编号"+bookid);
                System.out.println("图书名"+bookname);
            }
            //4.关闭结果集，数据库操作对象，数据库连接
            resultSet.close();
            statement.close();
            connection.close();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
