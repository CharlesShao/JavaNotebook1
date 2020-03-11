package com.komorebishao;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        //使用泛型
        ArrayList<String> aList1 = new ArrayList<String>();
        aList1.add("ddd");
        aList1.add("zhangsan");
        for (String string : aList1) {
            System.out.println(string);
        }
        //不使用泛型
        ArrayList aList2 = new ArrayList();
        aList2.add("dd");
        aList2.add(2);
        //返回的都是object，如果需要对数据进行计算，就比较麻烦
        for (Object object : aList2) {
            System.out.println(object);
        }
        //使用基本数据类型包装类，指定集合泛型
        ArrayList<Integer> aList3 = new ArrayList<Integer>();
        //迭代器
        Iterator<String> i1 = aList1.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
    }
}
