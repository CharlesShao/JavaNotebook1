package com.komorebishao2;

import com.komorebishao.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person zhangsan = new Person();
        zhangsan.sex = "male";//public修饰
//        zhangsan.name = "zhagnsan"; default修饰
//        zhangsan.height = 188.8; protected修饰
//        zhangsan.age = 11; 此方法由private修饰
    }
}
