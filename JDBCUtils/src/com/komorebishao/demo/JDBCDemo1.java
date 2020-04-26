package com.komorebishao.demo;

import com.komorebishao.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDemo1 {
    public static void main(String[] args) throws Exception {
        //第一步：建立链接
        Connection c1 = JDBCUtils.getConnection();
        System.out.println(c1);
        //statement和preparedstatement区别
        //statement 执行静态sql语句，每次执行数据库都要执行sql的编译操作，效率低下，并且有参数的时候还要拼接字符串，不能防止sql注入
        //preparedstatement：执行动态sql语句，预编译sql语句，执行效率高，安全性高
        //可以防止sql注入，代码可读性高，有参数的时候可以使用占位符，更方便
        //第二步：书写sql语句
        String sql="select * from user";
        //第三步：得到执行sql对象
        PreparedStatement preparedStatement = c1.prepareStatement(sql);
        //第四步：得到数据库中查询的数据
        //执行查询操作并返回结果 必须使用结果集接受
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()){
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("addr"));

            System.out.println("liehao"+rs.getInt(1));
        }

        //释放资源
        JDBCUtils.clossJDBC(c1, preparedStatement, rs);
    }
}
