package com.komorebishao;

public class StaticDemo1Test {
    public static void main(String[] args) {
        //其他类中访问一个类中静态成员（变量或方法中）
        //使用类名引用或对象名引用
        StaticDemo1.age= 18;
        StaticDemo1 demo1 = new StaticDemo1();
        demo1.age = 17;

        StaticDemo1.show();
    }
}
