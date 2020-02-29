package com.komorebishao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //获取当前时间 使用比较多
        Date d1 = new Date();
        System.out.println(d1);

        //毫秒的long类型换算成时间
        Date d2 = new Date(10000000l);
        System.out.println(d2);

        System.out.println(d1.getTime());
        System.out.println(d2.getTime());
        System.out.println(d2.toString());

        //时间格式转换类
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(d1));
    }
}
