package com.komorebishao1;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lhmHashMap = new LinkedHashMap<String, String>();
        lhmHashMap.put("张三", "male");
        lhmHashMap.put("李四", "male");
        lhmHashMap.put("王五", "male");
        lhmHashMap.put("钱六", "male");
        System.out.println(lhmHashMap);
    }
}
