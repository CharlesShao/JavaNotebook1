package com.komorebishao2;

import java.util.EnumSet;

enum Day{
    ONE, TWO, THREE
}
public class EnumSetDemo {
    public static void main(String[] args) {
        EnumSet<Day> allOfDays = EnumSet.allOf(Day.class);
        System.out.println(allOfDays);
    }
}
