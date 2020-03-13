package com.komorebishao1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        //因为set是一个接口，不能直接实例化，所以new的是它的一个子类
        Set s1 = new HashSet();
        s1.add("dddd");
        s1.remove("dddd");
        s1.clear();
        Iterator i1 = s1.iterator();
    }
}
