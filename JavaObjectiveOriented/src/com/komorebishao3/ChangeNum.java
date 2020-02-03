package com.komorebishao3;
//思考x输出的是什么
public class ChangeNum {
    public void changeNumber(int x) {
        System.out.println("x=" + x);
        x = 3;
        System.out.println("x=" + x);
    }
    public static void main(String[] args) {
        ChangeNum num1 = new ChangeNum();
        int x = 200;
        num1.changeNumber(x);
        System.out.println(x);
    }
}
