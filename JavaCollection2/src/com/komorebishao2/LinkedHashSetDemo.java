package com.komorebishao2;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //无序 唯一的
        //链表式的结构，与哈希码值都有关系
        //与hashSet相比 访问快 插入满
        //方法同hashSet一样
        LinkedHashSet<String> lhsHashSet = new LinkedHashSet<String>();
        lhsHashSet.add("张三");
        lhsHashSet.add("张三");
        lhsHashSet.add("张三");
        lhsHashSet.add("张三");
        lhsHashSet.add("张三");
        lhsHashSet.add("lisi");
        System.out.println(lhsHashSet);
    }
}
