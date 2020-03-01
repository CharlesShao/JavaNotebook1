package com.komorebishao3;
//代理类
public class ProxyObject implements Object{
    Object ob;
    public ProxyObject() {
        System.out.println("ProxyObject构造");
        ob = new ObjecImpl();
    }
    @Override
    public void action() {
        System.out.println("代理开始");
        ob.action();
        System.out.println("代理结束");
    }

}
