package com.komorebishao3;
//实现类(被代理内容)
public class ObjecImpl implements Object {
    @Override
    public void action() {
        System.out.println("--------");
        System.out.println("ObjectImpl");
        System.out.println("--------");
    }

}
