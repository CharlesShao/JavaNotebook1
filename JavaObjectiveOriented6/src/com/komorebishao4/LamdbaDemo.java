package com.komorebishao4;

public class LamdbaDemo {
    public static void main(String[] args) {
        LamdbaDemo lamdboDemo = new LamdbaDemo();
        //相加
        //()中使用类型声明
        Math01 sumMath01 = (int a, int b)-> a + b;
        System.out.println(lamdboDemo.op(10, 5, sumMath01));
        //减法
        //()中不使用类型声明
        Math01 deleteMath01 = (a, b) -> a - b;
        System.out.println(lamdboDemo.op(12, 4, deleteMath01));
        //乘法
        Math01 multiplicationMath01 = (int a, int b) -> {return a * b;};
        System.out.println(lamdboDemo.op(12, 4, multiplicationMath01));
    }

    //运算方法
    public int op(int a, int b, Math01 math01) {
        return math01.op1(a, b);
    }
}

interface Math01{
    int op1(int a, int b);
}