package com.komorebishao2;

public class Person3 {
    String name;
    int age;
    String sex;

    public Person3(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println(this);
    }

    public Person3() {
        this("ww", 18, "male");
        System.out.println("我是无参构造");
    }
    public  void eat() {
        System.out.println("eat");
    }
    public void sleep() {
        this.eat();
        System.out.println("sleep");
    }

    public static void main(String[] args) {
        Person3 zhangsan = new Person3("张三", 20, "男");
        System.out.println(zhangsan);
        Person3 ww = new Person3();
        System.out.println(ww.age);

        zhangsan.sleep();
    }
}
