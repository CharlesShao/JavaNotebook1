package com.komorebishao2;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet tSet = new TreeSet();
        tSet.add(122);
        tSet.add(123);
        tSet.add(112);
        tSet.add(312);
        tSet.add(124);
        tSet.add(1122);
        tSet.add(1212);
        System.out.println(tSet);
        System.out.println(tSet.first());
        System.out.println(tSet.last());
        //检索最小的并删除
        System.out.println(tSet.pollFirst());
        System.out.println(tSet);
        //检索到最大的并删除
        System.out.println(tSet.pollLast());
        System.out.println(tSet);
        //遍历可以用foreach和迭代器
    }
}
