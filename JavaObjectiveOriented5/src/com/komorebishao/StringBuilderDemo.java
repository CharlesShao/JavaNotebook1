package com.komorebishao;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("ddd");
        sBuilder.insert(1, 1111);
        sBuilder.delete(1, 2);
        sBuilder.toString();
        sBuilder.replace(1, 2, "222111");
        sBuilder.reverse();
        System.out.println(sBuilder);
    }
}
