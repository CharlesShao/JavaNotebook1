package com.komorebishao3;
public class ChangeNum2 {
    int x;
    //当前这个方法传递的参数是引用类型
    public void change(ChangeNum2 num2) {
        num2.x = 100;
    }
    public static void main(String[] args) {
        ChangeNum2 number2 = new ChangeNum2();
        number2.x = 200;
        number2.change(number2);
        System.out.println(number2.x);
    }
}
