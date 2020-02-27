package com.komorebishao3;

public class Dog extends Pet {
    String nameString = "dog"; //子类特有的与父类属性同名

    @Override
    public void eat() {
        System.out.println(nameString + "吃骨头");
    }
    public void sleep()	{
        System.out.println("sleep");
    }

    //特有 玩飞盘游戏
    public void catchingPlay() {
        System.out.println("与主人玩飞盘");
    }

}
