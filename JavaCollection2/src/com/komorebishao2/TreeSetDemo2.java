package com.komorebishao2;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<Pet> tSet = new TreeSet<Pet>();
        tSet.add(new Pet("张三", "white", 1));
        tSet.add(new Pet("mimi", "black", 1));
        tSet.add(new Pet("dada", "red", 1));
        tSet.add(new Pet("asas", "yellow", 1));
        System.out.println(tSet);
    }
}
