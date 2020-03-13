package com.komorebishao1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        //hashSet 存储数据不可重复，重复的输入只会存下一个
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("张三");
        hashSet.add("张三");
        System.out.println(hashSet);

        //遍历 foreach 迭代器
        for (String string : hashSet) {
            System.out.println(string);
        }
        Iterator<String> i1 = hashSet.iterator();
        while(i1.hasNext()) {
            System.out.println(i1.next());
        }
    }
}
