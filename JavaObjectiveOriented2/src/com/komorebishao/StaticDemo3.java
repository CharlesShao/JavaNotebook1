package com.komorebishao;

//import java.util.Arrays;
import  static java.util.Arrays.sort;
public class StaticDemo3 {
    public static void main(String[] args) {
        int num[] = {234,234,23,543,22};
        //数组排序
        //类名.方法名
//		Arrays.sort(num);

        //静态导包后可直接使用方法
        sort(num);
        for (int i : num) {
            System.out.println(i);
        }
    }
}
