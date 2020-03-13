package com.komorebishao2;

import java.util.HashSet;

public class Person {
    String nameString;
    int age;
    String sexString;
    public Person(String nameString, int age, String sexString) {
        this.age = age;
        this.nameString = nameString;
        this.sexString = sexString;
    }
    @Override
    public int hashCode() {

        return age;
    }
    //只要对象中姓名，年龄，性别是相同的，就判断为同一个对象，使用set保存后体现唯一性
    //根据性别 年龄  姓名
    @Override
    public boolean equals(Object obj) {
        Person p1 = (Person) obj;
        if (this.sexString.equals(p1.sexString)) {
            if (this.nameString.equals(p1.nameString)) {
                if (this.age == p1.age) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //需求： 使用hashSet 存储4个person对象并打印输出 与哈希码也有关系
        HashSet<Person> p1 = new HashSet<Person>();
        Person zhangsanPerson = new Person("张三", 12, "男");
        Person zhangsanPerson2 = new Person("张三", 12, "男");
        Person lisiPerson = new Person("李四", 17, "男");
        Person wangwuPerson = new Person("王五", 12, "男");
        p1.add(zhangsanPerson);
        p1.add(zhangsanPerson2);
        p1.add(lisiPerson);
        p1.add(wangwuPerson);
        System.out.println(p1);
    }
    @Override
    public String toString() {
        return "Person [nameString=" + nameString + ", age=" + age + ", sexString=" + sexString + "]";
    }
}
