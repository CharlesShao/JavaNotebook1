package com.komorebishao;

//使狗类继承 宠物类
//继承关键字在子类中书写
public class Dog extends Pet{
    public static void main(String[] args) {
        //子类继承父类就有了父类的成员属性和方法
        Dog xiaohuaDog = new Dog();
        xiaohuaDog.color = "blue";
        xiaohuaDog.name = "xiaohua";
        xiaohuaDog.sex = "male";
        xiaohuaDog.eat();
    }
}
