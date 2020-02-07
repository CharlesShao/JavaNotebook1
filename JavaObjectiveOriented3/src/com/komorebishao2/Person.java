package com.komorebishao2;

public class Person {
    String nameString;
    String sexString;
    int age;
    @Override
    public String toString() {
        return "Person [nameString=" + nameString + ", sexString=" + sexString + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        Person xiaomingPerson = new Person();
        System.out.println(xiaomingPerson);
    }
}
