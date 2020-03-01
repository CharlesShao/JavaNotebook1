package com.komorebishao2;

public class Test {
    public static void main(String[] args) {
        Master zhangsanMaster = new Master();
        //Pet接口
        //Pet p1 = new Dog();向上转型
        Pet p1 = zhangsanMaster.getPet("狗");
        p1.eat();

        Pet p2 = zhangsanMaster.getPet("猫");
        p2.eat();
    }
}
