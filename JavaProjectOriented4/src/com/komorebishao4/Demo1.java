package com.komorebishao4;

//抽象类 使用抽象关键字 abstract修饰的类就是抽象类
public abstract class Demo1 {
    String name;
    int age;
    //抽象类中可以声明构造方法 方便子类调用
    public Demo1(){
        System.out.println("构造方法");
    }

    public void show(){
        System.out.println("显示方法");
    }

    //抽象方法 使用抽象关键字修饰的方法就是抽象方法 注意抽象方法没有方法体
    //此方法在抽象类中没有啥含义 用于子类重写 且必须被重写
    public abstract void eat();

    public static void main(String[] args) {
        //Demo1 demo1 = new Demo1(); 错误，抽象类只能被继承，不能实例化
    }
}
