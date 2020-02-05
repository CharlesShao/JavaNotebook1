package com.komorebishao;

public class PersonTest {
    public static void main(String[] args) {
        Person zhangsan = new Person();
//        zhagnsan.age = 23;private修饰的变量只能在所处的类中使用
        zhangsan.sex = "male";
        zhangsan.height = 178.8;
        zhangsan.name = "zhangsan";


    }
}

