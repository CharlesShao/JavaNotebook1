package com.komorebishao3;
//静态内部类
public class Outer {
    String nameString = "1234";
    static String sexString;
    //静态内部类可以使用四种权限修饰符修饰
    static class Inner{
        //类中可以声明静态方法和非静态方法，以及成员变量和静态变量
        //静态内部类中不能访问外部类非静态成员
        static String nameString = "123";
        int age;
        public void show() {
            System.out.println(nameString);
        }
        public static void display() {
            System.out.println(sexString);
        }
    }
    public static void main(String[] args) {
        //静态内部类不依附于外部对象，直接new对象
        Inner i1 = new Inner();
        i1.show();
    }
}
