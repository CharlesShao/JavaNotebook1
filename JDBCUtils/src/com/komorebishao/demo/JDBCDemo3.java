package com.komorebishao.demo;

import com.komorebishao.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDemo3 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = scanner.next();
        System.out.println("请输入密码");
        String pwd = scanner.next();

        Connection c1 = JDBCUtils.getConnection();
        String sql = "select * from user where name = ? and password = ?";
        PreparedStatement ps = c1.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, pwd);
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            System.out.println(rs.getString("name") + "登陆成功");
        }
        JDBCUtils.clossJDBC(c1, ps, rs);
    }
}
