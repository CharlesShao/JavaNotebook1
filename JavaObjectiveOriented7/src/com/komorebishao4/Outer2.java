package com.komorebishao4;

//抽象类
abstract class B{
    abstract void show();
}
public class Outer2 {
    public void callInner(B b1) {
        b1.show();
    }
    public static void main(String[] args) {
        new Outer2().callInner(new B() {
            @Override
            void show() {
                System.out.println("show");
            }
        });
    }
}
