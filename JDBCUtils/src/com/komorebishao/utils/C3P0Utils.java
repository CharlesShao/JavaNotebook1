package com.komorebishao.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

//C3P0工具类
public class C3P0Utils {
    private static ComboPooledDataSource cpds = new ComboPooledDataSource();

    public static Connection getConnection() throws SQLException {
        return cpds.getConnection();
    }
    //返回datasource数据源
    public static ComboPooledDataSource getDataSource(){
        return cpds;
    }

}
