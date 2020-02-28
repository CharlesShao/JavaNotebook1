package com.komorebishao5;
//接口声明 只能包含静态常量和抽象方法
public interface Lock {
    //接口中的常量有默认的修饰符public static final
    //接口中的抽象方法 可以省略关键字abstract

    //上锁
    public void closeLock();
    //开锁
    public void openLock();
}
//接口与接口之间是继承，接口与类之间是实现
interface BlueLock extends Lock{

}
