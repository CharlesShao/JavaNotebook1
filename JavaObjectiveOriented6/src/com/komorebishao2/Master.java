package com.komorebishao2;

public class Master {
    //领养方法
    public Pet getPet(String name) {
        if (name.equals("狗")) {
            return new Dog();
        }else if (name.equals("猫")) {
            return new Cat();
        }
        return null;
    }
}
