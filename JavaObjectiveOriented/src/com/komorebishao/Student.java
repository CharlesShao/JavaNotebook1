package com.komorebishao;
//定义一个学生类
public class Student {
    //学生的特征/属性===>姓名 年龄 性别
    String nameString;
    int age;
    String sexsString;

    //学生的行为===>读书 吃饭 休息
    public void study() {
        System.out.println("念书");
    }
    public void eat() {
        System.out.println("吃饭");
    }
    public void rest() {
        System.out.println("休息");
    }
}
