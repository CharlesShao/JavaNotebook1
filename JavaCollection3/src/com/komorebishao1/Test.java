package com.komorebishao1;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] next = new int[101];
        Arrays.fill(next,Integer.MAX_VALUE);
        for (int i = 0; i <101; i++){
            System.out.println(next[i]);
        }
    }
}
