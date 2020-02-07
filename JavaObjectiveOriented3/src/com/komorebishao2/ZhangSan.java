package com.komorebishao2;

import com.komorebishao.Person;

public class ZhangSan extends Person {

    //调用父类的属性和方法
    public ZhangSan(){
        //调用父类构造方法
        super();
    }
    public void show(){
        System.out.println(super.age);
        super.eat();
    }

    //方法的重写
    @Override
    public void eat() {
        // TODO Auto-generated method stub
        super.eat();
        System.out.println(name + "eat");
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.sex = "female";
//		person.age; 不同包不可访问
//		person.name; 不同包不可访问

        ZhangSan zs = new ZhangSan();
        zs.age = 12;// protect修饰的继承后可访问
        zs.name = "zhangsan";
        zs.eat();
    }
}
