package com.komorebishao2;

public class Master {
    //主人类 可以使用打印机
    //使用打印机的方法
    //多态形式 父类类型当作方法的参数类型
    //父类类型 可以接受所有的子类对象
    public void mPrinter(Printer printer){
        //打印功能
        printer.print();
    }

    public static void main(String[] args) {
        Master zhangsanMaster = new Master();

        Printer p1 = new Printer();
        zhangsanMaster.mPrinter(p1);

        Printer p2 = new BWPrinter();
        zhangsanMaster.mPrinter(p2);

        Printer p3 = new ColorPrinter();
        zhangsanMaster.mPrinter(p3);

    }
}
