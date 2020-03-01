package com.komorebishao1;
//单例模式只能有一个实例
//该实例还可以被其他类访问到
//懒汉式
public class SingleTon1 {
    //当前对象，只能本类中访问
    //private->只能本类中访问 static->静态方法只能调用静态变量
    private static SingleTon1 s1 = null;
    //解决第一个问题 外界访问的不能让他new对象->构造方法私有化
    private SingleTon1() {

    }

    //解决第二个问题 外界能访问当前类对象 每次访问都是同一个对象->书写一个方法，其返回类型就是当前类类型
    //供外界访问，不依附于对象->static静态方法，凌驾于对象之上
    public static SingleTon1 getSignTon() {
        if (s1 == null) {
            System.out.println("实例化对象了");
            s1 = new SingleTon1();
        }
        return s1;
    }
    //类中是要给方法一个当前对象，没有当前对象就声明一个

    public static void main(String[] args) {
        SingleTon1 dSignTon = new SingleTon1();
        SingleTon1 dSignTon2 = new SingleTon1();
        System.out.println(dSignTon == dSignTon2);//每次new都是新对象，所以是不同的对象

        SingleTon1 s1 = getSignTon();
        SingleTon1 s2 = getSignTon();
        System.out.println(s1 == s2);//true 表示s1和s2是同一个对象
    }
}
