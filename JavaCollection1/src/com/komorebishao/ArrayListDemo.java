package com.komorebishao;

import java.util.ArrayList;

public class ArrayListDemo {
    //有序，可重复，因为是数组集合，遍历快，随机访问元素也快，插入和删除慢
    public static void main(String[] args) {
        ArrayList aList = new ArrayList();
        //添加
        aList.add("dd");
        aList.add("dd");
        aList.add(12);
        aList.add(true);
        //通过下标得到
        System.out.println(aList.get(2));

        System.out.println(aList.size());
//		aList.clear();
        System.out.println(aList);
        //遍历 同list一样，可以用for循环，foreach，迭代器
    }
}
