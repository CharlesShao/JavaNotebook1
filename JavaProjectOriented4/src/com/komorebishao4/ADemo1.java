package com.komorebishao4;

public class ADemo1 extends Demo1{
    //必须实现抽象方法，否则会报错
    @Override
    public void eat() {
        System.out.println("吃");
    }
    public static void main(String []args){
        ADemo1 demo1 = new ADemo1();
        demo1.age = 12;
        demo1.name = "xiaoming";
        demo1.show();
    }
}
