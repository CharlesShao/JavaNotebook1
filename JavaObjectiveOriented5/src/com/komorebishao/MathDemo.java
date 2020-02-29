package com.komorebishao;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.min(11, 22));
        System.out.println(Math.max(122, 1222));
        //四舍五入
        System.out.println(Math.round(33.4));
        //绝对值
        System.out.println(Math.abs(-33.4));
        //生成随机数0.0-1.0之间的数
        //0-10之间数
        System.out.println((int)(Math.random() * 10));
    }
}
