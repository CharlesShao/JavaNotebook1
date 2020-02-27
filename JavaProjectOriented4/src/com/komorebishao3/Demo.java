package com.komorebishao3;

public class Demo {
    //向上转型 子类对象转换成 父类类型 自动类型转换
    public static void main(String[] args) {
        Pet p1 = new Dog();
        //向上转型 父类中与子类成员变量名相同 输出成员变量 调用的是父类的成员变量
        System.out.println(p1.nameString);//因为向上转型了，调用的父类属性，所以这里输出的是null
        //向上转型 直接调用时调用的时父类和子类共有的属性和方法 不能调用特有的
        //p1.sleep;这是子类特有的，所以不能调用
        //当子类进行方法的重写后，调用的是子类重写后的方法
        p1.eat();//输出的是dog吃骨头

//        Pet p2 = new Pet();这里错误，向下转型的前提是向上转型
//        Dog dog = (Dog)p2;
//        dog.catchingPlay();

    }
}
