package com.komorebishao.utils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class DBUtilsDemo1 {
    //DBUtils封装了 结果 优化 查询 这部分
    //结果返回是单行数据
    public static void main(String[] args) throws SQLException {
        //第一步： 初始化queryrunner对象，并传入数据源
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        //执行查询并返回结果
        String sql = "select * from user where id=2";
        //ResultSetHandler resultSetHandler;//结果集处理器 dbutils帮助封装了结果
        User user = queryRunner.query(sql, new BeanHandler<User>(User.class));
        System.out.println(user);
    }

    //增删改 插入 案例
}
