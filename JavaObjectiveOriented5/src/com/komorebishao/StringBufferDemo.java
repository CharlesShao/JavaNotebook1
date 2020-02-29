package com.komorebishao;

public class StringBufferDemo {
    //StringBuffer在源码上比StringBuilder多了同步锁关键字

    //可改变长度的字符串
    public static void main(String[] args) {
        //声明1
        StringBuffer sbBuffer = new StringBuffer();
        //声明2
        StringBuffer sbBuffer2 = new StringBuffer("wangwu");
        //追加
        sbBuffer.append("张三");
        sbBuffer.append("李四");
        System.out.println(sbBuffer);
        System.out.println(sbBuffer2);
        //删除
        System.out.println("开始执行删除");
        //从开始索引到结束索引 包含开始索引不包含结束索引
        sbBuffer.delete(1, 2);
        System.out.println(sbBuffer);
        //插入 插入到该索引位置 第一个参数索引值 第二个参数是内容
        sbBuffer.insert(1, 222);
        System.out.println(sbBuffer);
        //修改 从开始结束到结束索引 不包含结束索引
        sbBuffer.replace(1, 2, "333");
        System.out.println(sbBuffer);
        //长度
        System.out.println(sbBuffer.length());
        //字符串反转
        System.out.println(sbBuffer.reverse());
        //转换成String
        System.out.println(sbBuffer.toString());


        String s1 = "zhagnsan";
        //字符串拼接并不改变字符串本身
        System.out.println(s1.concat("dd"));
        System.out.println(s1);
    }
}
