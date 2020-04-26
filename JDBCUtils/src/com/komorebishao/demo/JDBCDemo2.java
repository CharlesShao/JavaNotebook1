package com.komorebishao.demo;

import com.komorebishao.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDemo2 {
    public static void main(String[] args) throws SQLException {
        //建立连接
        Connection c1 = JDBCUtils.getConnection();
        //书写sql语句
        String sql = "insert into user values(3,'王五','北京')";
        //第三步 得到sql执行对象 并传入sql字符串
        PreparedStatement ps = c1.prepareStatement(sql);
        //第四步:查看结果
        int rows = ps.executeUpdate();
        if (rows > 0){
            System.out.println("添加成功");
        }
        JDBCUtils.clossJDBC(c1, ps, null);
    }
}
