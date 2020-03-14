package com.komorebishao1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("name", "张三");
        properties.setProperty("age", "12");
        System.out.println(properties);
        //把properties属性存放到文件中
        //outputstream是接口，所以用它的一个实现子类
        try {
            properties.store(new FileOutputStream("src/hello.properties"), "注释");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //从文件中读取内容
        Properties properties2 = new Properties();
        try {
            properties2.load(new FileInputStream("src/hello.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(properties2);
    }
}
