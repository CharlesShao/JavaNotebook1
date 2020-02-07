package com.komorebishao2;

public class Dog extends Pet{
    public Dog() {
//		super(); 这句话默认就有
        System.out.println("Dog无参");
    }
    public static void main(String[] args) {
        Dog xiaohuaDog = new Dog();
    }
}
