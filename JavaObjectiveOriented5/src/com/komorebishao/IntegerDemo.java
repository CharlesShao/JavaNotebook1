package com.komorebishao;

public class IntegerDemo {
    public static void main(String[] args) {
        Integer i1 = 14;//装箱

        int a = i1.intValue();//拆箱
        //可以把字符串转换成int类型
        int b = i1.parseInt("1111");
        System.out.println(b+22);
        long l1 = i1.longValue();
        Integer ii1 = i1.valueOf(111);

    }
}
