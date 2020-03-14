package com.komorebishao1;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        //添加元素 map特点：存储键值对数据类型，键唯一，通过equals判断，值可重复
        map.put("name", "charlie");
        map.put("name", "charlie");
        map.put("name2", "charlie2");
        map.put("name3", "charlie3");
        map.put("name4", "charlie4");
        map.put("name5", "charlie5");
        System.out.println(map);
        //清空
//		map.clear();
//		System.out.println(map);
        //移除
        map.remove("name");
        System.out.println(map);
        //通过键得到对应的值
        System.out.println(map.get("name2"));
        //替换
        map.replace("name2", "zhangsan");
        System.out.println(map);

        //遍历1
        //使用keyset方法，把当前map集合中的键转换成set集合
        Set s1 = map.keySet();
        //虽然map中没有迭代器，没法遍历，但是有转换成set集合的方法，set中有迭代器的
        //foreach
        for (Object object : s1){
            System.out.println("forech:" + object + "=" + map.get(object));
        }
        //迭代器
        Iterator iterator = s1.iterator();
        while (iterator.hasNext()){
            Object o1 = iterator.next();
            System.out.println("迭代器" + o1 + ":" + map.get(o1));
        }
        //遍历2 使用entryset返回值包含映射关系
        Set<Map.Entry<Object, Object>> s2 = map.entrySet();
        //迭代器
        Iterator<Map.Entry<Object, Object>> iterator2 = s2.iterator();
        while(iterator2.hasNext()){
            //System.out.println("entry:  " + iterator2.next());
            //如果需要分别得到键以及值
            Map.Entry<Object, Object> nextEntry = iterator2.next();
            System.out.println(nextEntry.getKey() + "---" + nextEntry.getValue());
        }
        //foreach
        for (Map.Entry<Object, Object> entry : s2){
            System.out.println("entryforeach:" + entry.getKey() + "---" + entry.getValue());
        }
        //把map中的值转换成collection集合
        Collection values = map.values();
        System.out.println("map中的值：" + values);
    }
}
