package com.komorebishao;

public class Person {
    String name;
    private int age;
    protected double height;
    public String sex;

    public static void main(String[] args) {
        Person zhangsan = new Person();
        zhangsan.name = "zhangsan";
        zhangsan.height = 178.6;
        zhangsan.sex = "male";
        zhangsan.age = 22;
    }
}

//default修饰的
class Dog{
    public String name;
}