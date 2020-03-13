package com.komorebishao2;

import java.util.Comparator;
import java.util.TreeSet;

public class Pet2{
    int age;

    public Pet2(int age) {
        super();
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet2 [age=" + age + "]";
    }

    public static void main(String[] args) {
//		TreeSet<Pet2> treeSet = new TreeSet<Pet2>();
//		treeSet.add(new Pet2(12));
//		treeSet.add(new Pet2(123));
        //方式二 使用内部类，外部就不用再实现接口
        TreeSet<Pet2> treeSet2 = new TreeSet<Pet2>(new Comparator<Pet2>() {
            @Override
            public int compare(Pet2 o1, Pet2 o2) {
                // TODO Auto-generated method stub
                return o1.age > o2.age ? -1 : o1.age < o2.age ? 1 : 0;
            }
        });
        treeSet2.add(new Pet2(12));
        treeSet2.add(new Pet2(13));
        treeSet2.add(new Pet2(23));
        System.out.println(treeSet2);
    }

}
