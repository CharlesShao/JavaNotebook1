package com.komorebishao1;

import java.util.HashMap;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<Person, String> hashMap = new HashMap<Person, String>();
        hashMap.put(new Person("张三", 12), "北京");
        hashMap.put(new Person("李四", 14), "天津");
        hashMap.put(new Person("王五", 19), "上海");
        hashMap.put(new Person("王五", 19), "上海");
        System.out.println(hashMap);
        //因为hashcode不同，所以同样的输入会认为是不同的内容
        //重写equals和hashcode（使用快捷键快速创建）
    }
}
