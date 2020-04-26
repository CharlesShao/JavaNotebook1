package com.komorebishao.demo;

import com.komorebishao.utils.JDBCUtils;
import com.komorebishao.utils.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDemo4 {
    public static void main(String[] args) throws SQLException {
        User u1 = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入id");
        int id = scanner.nextInt();
        Connection c1 = JDBCUtils.getConnection();
        String sql = "select * from user where id = ?";
        PreparedStatement preparedStatement = c1.prepareStatement(sql);
        preparedStatement.setInt(1,id);

        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()){
            u1.setId(rs.getInt("id"));
            u1.setName(rs.getString("name"));
            u1.setAddr(rs.getString("addr"));
            u1.setPassword(rs.getString("password"));
        }
        System.out.println(u1);
    }
}
