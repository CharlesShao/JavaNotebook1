package com.komorebishao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        System.out.println("hehe");
    }

    public static boolean match(char[] str, char[] pattern) {
        String regex = ".", string = "*";
        for (int i = 0; i < pattern.length; i++) {
            regex += pattern[i];
        }
        for (int i = 0; i < str.length; i++) {
            string += str[i];
        }

        Pattern pattern1 = Pattern.compile(regex);
        Matcher matcher=pattern1.matcher(string);

        return matcher.matches();

    }
}
