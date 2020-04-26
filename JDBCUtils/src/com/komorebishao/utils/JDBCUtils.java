package com.komorebishao.utils;

import java.sql.*;

public class JDBCUtils {
    public static String URL = "jdbc:mysql://localhost:3306/mybase01?serverTimezone = GMT";
    public static String USR = "root";
    public static String PASSWORD = "12071725scy";
    public static String JDBCDRIVER = "com.mysql.cj.jdbc.Driver";
    //注册驱动放到静态代码块中 只注册一次
    static{
        try {
            Class.forName(JDBCDRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        //第二部：得到connection
        try {
            return DriverManager.getConnection(URL, USR, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //关闭资源
    public static void clossJDBC(Connection c1, Statement s1, ResultSet rs){
        if (c1 != null){
            try {
                c1.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(s1 != null){
            try {
                s1.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
