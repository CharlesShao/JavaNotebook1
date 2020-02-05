package com.komorebishao;

public class Demo1 {
    //public公共的，可以修饰变量、方法、类
    //修饰变量的权限
    public String name;

    //default默认的，可以修饰变量、方法、类
    int age;//默认的default
    void show() {
    }

    //priva私有的,可以修饰变量和方法，不能修饰类 跟封装有关
    private String sex;
    private void show2() {
    }

    //protected受保护的，作用是保护子类，可以修饰变量和方法，不能修饰类
    protected double height;
    protected void show3() {
    }
}
//当前类的修饰符为default
class A{

}