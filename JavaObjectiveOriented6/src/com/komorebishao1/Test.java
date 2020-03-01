package com.komorebishao1;

public class Test {
    public static void main(String[] args) {
        //SignTon1 signTon = new SignTon1();外部访问时不能new对象已解决
        //其他类中访问单例类
        SingleTon1 signTon = SingleTon1.getSignTon();
    }
}
