package com.komorebishao1;
import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
        //...表示在调用方法的时候可以书写多个参数
        //asList(T...a);
        //返回的这个集合长度不可变，不能删除和添加
        List<String> l1 =  Arrays.asList("zhangsan", "lisi", "wangwu");
        System.out.println(l1);
        //补充示例
        show(1,3,4);
    }
    //补充示例：不确定当前会传入多少参数时
    //注意，...必须放在最后一个参数类型的后面
    public static void show(int... a) {

    }
}
