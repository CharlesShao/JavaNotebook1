package com.komorebishao;

public class Cat extends Pet{
    public static void main(String[] args) {
        Cat xiaobaiCat = new Cat();
        xiaobaiCat.color = "white";
        xiaobaiCat.name = "xiaobai";
        xiaobaiCat.sex = "female";
        xiaobaiCat.eat();
    }
}
