package com.komorebishao;
//定义一个狗"类"
public class Dog {
    //狗的特征/属性===>名字 年龄 颜色
    //狗的行为===>睡觉 吃饭 玩耍
    String name;
    int age;
    String color;

    public void sleep() {
        System.out.println("狗狗睡觉");
    }
    public void eat() {
        System.out.println("狗狗吃饭");
    }
    public void play() {
        System.out.println("狗狗玩耍");
    }
}
