package com.komorebishao2;

public class Pet implements Comparable<Pet>{
    String nameString;
    String colorString;
    int age;
    public Pet(String nameString, String colorString, int age) {
        super();
        this.nameString = nameString;
        this.colorString = colorString;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Pet [nameString=" + nameString + ", colorString=" + colorString + ", age=" + age + "]";
    }
    //treeset中的比较方法 原理：红黑二叉树
    @Override
    public int compareTo(Pet o) {

        return 0;
    }
}
