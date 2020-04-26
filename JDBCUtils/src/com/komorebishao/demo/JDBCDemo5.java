package com.komorebishao.demo;

import com.komorebishao.utils.JDBCUtils;
import com.komorebishao.utils.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo5 {
    public static void main(String[] args) throws SQLException {
        List<User> list = new ArrayList<User>();

        Connection c1 = JDBCUtils.getConnection();
        String sql = "select * from user";
        PreparedStatement preparedStatement = c1.prepareStatement(sql);

        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()){
            User u1 = new User();
            u1.setId(rs.getInt("id"));
            u1.setName(rs.getString("name"));
            u1.setAddr(rs.getString("addr"));
            u1.setPassword(rs.getString("password"));
            list.add(u1);
        }
        System.out.println(list);
    }
}
