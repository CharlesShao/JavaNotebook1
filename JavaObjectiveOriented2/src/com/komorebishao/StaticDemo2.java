package com.komorebishao;

public class StaticDemo2 {
    //代码块
    {
        System.out.println("代码块");
    }
    //静态代码块
    static {
        System.out.println("静态代码块");
    }
    public static void main(String[] args) {
        StaticDemo2 demo1 = new StaticDemo2();
        StaticDemo2 demo2 = new StaticDemo2();
        StaticDemo2 demo3 = new StaticDemo2();
    }
}
