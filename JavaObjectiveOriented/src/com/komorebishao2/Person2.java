package com.komorebishao2;
//构造方法作用2.初始化属性(成员变量)
public class Person2 {
    String name;
    int age;
    String sex;

    //构造方法 无参构造
    public Person2(){
        System.out.println("我是无参构造");
    }
    //构造方法 有参构造 利用参数给属性赋值
    public Person2(String getName, int gatAge, String getSex){
        name = getName;
        age = gatAge;
        sex = getSex;
    }

    public static void main(String[] args) {
        //使用无参构造方法创建对象
        Person2 person2 = new Person2();
        person2.age = 15;
        person2.sex = "男";
        person2.name = "wangWu";
        System.out.println(person2.name);
        System.out.println(person2.sex);
        System.out.println(person2.age);

        //每new一个对象都是新对象
        //使用有参构造创建对象
        Person2 lisi = new Person2("李四", 12, "男");
        System.out.println(lisi.name);
        System.out.println(lisi.sex);
        System.out.println(lisi.age);
    }
}
