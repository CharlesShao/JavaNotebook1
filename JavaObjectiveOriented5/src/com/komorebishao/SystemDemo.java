package com.komorebishao;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println(111);
        //错误输出
        System.err.println(2233);

        //返回当前时间的毫秒数
        System.out.println(System.currentTimeMillis());
        //系统退出 正常退出0 非正常退出非0
        System.exit(0);
    }
}