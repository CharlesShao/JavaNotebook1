package com.komorebishao2;
//构造方法作用1.初始化对象
public class Person1 {
    String name;
    int age;
    String sex;

    //构造方法 无参构造
    public Person1(){
        System.out.println("我是无参构造");
    }
    //构造方法 有参构造
    public Person1(int age){
        System.out.println(age + "岁");
    }
    //若没有提供构造方法，系统会给一个默认的无参构造，若提供了就根据我们提供的构造方法创建对象

    public static void main(String[] args) {
        //创建了对象 liSi 若当前类中没有定义构造方法 系统会给一个默认的无参构造
        //创建对象是根据构造方法初始化对象
        Person1 liSi = new Person1();//使用无参构造
        Person1 jack = new Person1(12);//使用有参构造
        //System.out.println(liSi);
    }

}
