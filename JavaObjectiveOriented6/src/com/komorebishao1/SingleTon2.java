package com.komorebishao1;
//饿汉式
public class SingleTon2 {
    private static final SingleTon2 s1 = new SingleTon2();
    private SingleTon2() {

    }
    public static SingleTon2 getSingleTon2() {
        return s1;
    }
    public static void main(String[] args) {
        SingleTon2 s1 = getSingleTon2();
        SingleTon2 s2 = getSingleTon2();
        System.out.println(s1 ==s2);//返回true表示当前两个对象是同一个对象
    }
}
