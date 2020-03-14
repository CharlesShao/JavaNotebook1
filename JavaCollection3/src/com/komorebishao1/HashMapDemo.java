package com.komorebishao1;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("zhangsan", "lisi");
        hashMap.put(null, null);
        System.out.println(hashMap);
        //hashmap线程不安全，效率高，可以null键null值，hashtable 线程安全，效率低，不可以null键null值
        //线程安不安全看源码有没有线程安全相关的关键字
    }
}
