package com.komorebishao4;

//匿名内部类
interface A{
    void show();
}

public class Outer {
    String nameString;
    public void callInner(A a) {
        a.show();
    }
    public static void main(String[] args) {
        new Outer().display();//补充示例：像这样调用的只能使用一次
        //匿名内部类
        //在安卓中应用很广泛
        //java中主要用作接口回调 用于优化
        new Outer().callInner(new A() {
            int age;
            @Override
            public void show() {
                System.out.println("show");
                //System.out.println(nameString);不能调用外部类中属性
            }
        });
        //不使用内部类
        new Outer().callInner(new AImpl());
    }
    public void display() {
        System.out.println("display");
    }
}
class AImpl implements A {

    @Override
    public void show() {
        System.out.println("show1");
    }
}