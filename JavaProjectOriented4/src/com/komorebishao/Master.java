package com.komorebishao;
//不使用多态
//每次都需要写一个专门的方法
public class Master {
    //打印机方法 黑白纸张 彩色纸张
    //黑白纸张 使用黑白打印机
    public void playBWPrinter(){
        BlackPrinter blackPrinter = new BlackPrinter();
        blackPrinter.print();
    }
    //彩色纸张 使用彩色打印机
    public void playColorPrinter(){
        ColorPrinter colorPrinter = new ColorPrinter();
        colorPrinter.print();
    }
}
