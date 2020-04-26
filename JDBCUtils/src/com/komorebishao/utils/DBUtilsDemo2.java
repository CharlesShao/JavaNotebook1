package com.komorebishao.utils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class DBUtilsDemo2 {
    //DBUtils封装了 结果 优化 查询 这部分
    //结果返回是单行数据
    public static void main(String[] args) throws SQLException {
        //第一步： 初始化queryrunner对象，并传入数据源（连接池工具类中封装方法返回数据源）
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        //执行查询并返回结果
        String sql = "select * from user";
        //ResultSetHandler resultSetHandler;//结果集处理器 dbutils帮助封装了结果
        List<User> list1 = queryRunner.query(sql, new BeanListHandler<User>(User.class));
        System.out.println(list1);
    }

    //增删改 插入 案例
}
