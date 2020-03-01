package com.komorebishao5;

public class EnumDemo{
    enum number{
        one, two, three, four
    }
    public static void main(String[] args) {
        number n1 = number.one;
        number n2 = number.four;
        System.out.println("-----toString-----");
        System.out.println(n1.toString());
        System.out.println(n1.values());//返回枚举类型数组
        System.out.println(n1.name());
        System.out.println(n1.ordinal());//下标
        System.out.println(n2.ordinal());
        System.out.println(n1.getDeclaringClass());//返回当前类型
    }
}