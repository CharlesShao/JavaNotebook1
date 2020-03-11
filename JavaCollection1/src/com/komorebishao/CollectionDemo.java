package com.komorebishao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        //集合导包 全都是java.util包下的
        //无序，可重复
        //因为是接口，不能实例化(创建对象)，所以想使用里面的方法，需要借用其实现子类
        //向上转型特点，只能调用共有的属性和方法
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        //1.添加 虽然不能添加基本数据类型，但是可以添加包装类
        c1.add(10);
        c1.add(true);
        c1.add(33.4);
        c1.add("ddd");
        c2.add("c2");
        c2.add(true);
        //1.1添加集合
        c1.addAll(c2);
        System.out.println(c1);//和数组不同，不需要遍历就能打印出所有的元素
        System.out.println("----------------");
        //2.清空
        c1.clear();
        System.out.println(c1);
        System.out.println(c2);
        c1.add(33.4);
        c1.add("ddd");
        c1.add(true);
        c1.addAll(c2);
        System.out.println("----------------");
        //3.移除单个元素
        c1.remove("ddd");//移除里面的元素
        System.out.println(c1);
        System.out.println("----------------");
        //4.移除里面的集合(注意，removeAll会移除所有和c2中元素相同的集合)
        c1.removeAll(c2);
        System.out.println(c1);
        System.out.println("----------------");
        //5.判断此集合是否是空元素集合
        System.out.println(c1.isEmpty());
        System.out.println("----------------");
        //6.判断该元素是否存在于此集合中
        System.out.println(c1.contains(33.4));
        System.out.println("----------------");
        //6.6判断该集合是否存在于此集合中
        c1.addAll(c2);
        System.out.println(c1.containsAll(c2));
        System.out.println("----------------");
        //7.长度
        System.out.println("集合长度" + c1.size());
        System.out.println("----------------");

        //遍历 只要有迭代器，都可以使用foreach（for增强）去遍历集合
        //1.1foreach遍历
        //for(数组或集合数据类型 用于遍历的变量名 : 数组名或集合名){输出用于遍历的变量}
        //集合中只能存储引用类型，所以数据类型使用Object
        for (Object object : c1) {
            System.out.println(object);
        }
        //2.迭代器遍历
        //得到迭代器
        Iterator i1 = c1.iterator();
        System.out.println("使用迭代器");
        //判断游标后面有没有元素 有就返回true
        while (i1.hasNext()) {
            //返回游标下一个元素，并把游标移动到下一个位置
            System.out.println(i1.next());
        }
        //这里返回的就是false了，因为游标已经在最后了，所以如果想要再次操作，需要再书写一个迭代器对象
//		while (i1.hasNext()) {
//			//返回游标下一个元素，并把游标移动到下一个位置
//			System.out.println(i1.next());
//		}
        System.out.println("----------------");
        Iterator i2 = c1.iterator();
        while (i2.hasNext()) {
            System.out.println(i2.next());
        }

        //集合中的有序无序，看能不能用下表访问数据——collection无序
    }
}
