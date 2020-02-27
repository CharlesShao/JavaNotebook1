package com.komorebishao;

public class ColorPrinter {
    //彩色打印机
    public void print(){
        System.out.println("彩色纸张");
    }

    public static void main(String[] args) {
        ColorPrinter cp = new ColorPrinter();
        cp.print();
    }
}
