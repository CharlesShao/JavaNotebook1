package com.komorebishao.utils;

import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
//dbcp工具类
public class DBCPUtils {
    private static DataSource dataSource = null;
    static {
        //第一步 得到db文件
        InputStream is = DBCPUtils.class.getClassLoader().getResourceAsStream("db.properties");
        Properties p1 = new Properties();
        //加载文件
        try {
            p1.load(is);
            dataSource = BasicDataSourceFactory.createDataSource(p1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static DataSource getDataSource(){
        return dataSource;
    }
}
