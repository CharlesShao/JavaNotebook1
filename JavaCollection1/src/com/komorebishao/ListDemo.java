package com.komorebishao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        //1.添加
        l1.add("ddd");
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(1,"张三");
        System.out.println(l1);
        //2.移除（根据下标）
        l1.remove(2);
        System.out.println(l1);
        //3.清空 长度 还有空集合判断 判断元素是否包含在集合中 这些都和collection一样的
        //4.通过下标得到元素
        System.out.println(l1.get(1));
        //5.替换
        l1.set(2, "李四");
        //6.返回元素第一次出现的索引值
        System.out.println(l1.indexOf("李四"));
        //7.遍历 可以用for循环 foreach 迭代器
        System.out.println("for循环------------");
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        System.out.println("foreach------------");
        for (Object object : l1) {
            System.out.println(object);
        }
        System.out.println("迭代器------------");
        Iterator iterator = l1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("列表迭代器正序---------");
        //列表迭代器 正序
        ListIterator listIterator = l1.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("列表迭代器倒序---------");
        //列表迭代器，倒序
        ListIterator listIterator2 = l1.listIterator();
        //ListIterator是从第一个开始的，所以需要遍历到结尾
        while (listIterator2.hasNext()) {
            listIterator2.next();
        }
        System.out.println("开始输出倒序");
        while (listIterator2.hasPrevious()) {
            System.out.println(listIterator2.previous());
        }
    }
}
