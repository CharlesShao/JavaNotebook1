package com.komorebishao3;

public class Cat extends Pet {

    @Override
    public void eat() {
        System.out.println(nameString + "吃鱼");
    }

    //特有 抓老鼠
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}