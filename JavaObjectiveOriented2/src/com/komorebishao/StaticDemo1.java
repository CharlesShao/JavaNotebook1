package com.komorebishao;

public class StaticDemo1 {
    //静态变量存储在方法区，凌驾于对象之上 被对象所共享
    static int age;
    public static void show() {
        //静态方法中只能调用静态变量和方法
        System.out.println("show");
    }
    public void show2() {
        //非静态方法既可以调用非静态变量和方法，也可调用静态变量和方法
        System.out.println(age);
    }

    public static void main(String[] args) {
        //直接引用，使用类名引用，使用对象引用
        //直接引用
        age = 16;
        System.out.println(age);
        //类名引用
        StaticDemo1.age = 13;
        System.out.println(StaticDemo1.age);
        //对象引用
        StaticDemo1 staticdemo = new StaticDemo1();
        staticdemo.age = 17;
        System.out.println(staticdemo.age);

        show();
        System.out.println(age);
    }
}
