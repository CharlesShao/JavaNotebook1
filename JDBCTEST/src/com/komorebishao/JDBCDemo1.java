package com.komorebishao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo1 {

    public static void main(String[] args) {
        //1.注册驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/mybase01?serverTimezone = GMT";
        String user = "root";
        String password = "12071725scy";
        //2.建立连接对象
        try {
            Connection c1 = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
