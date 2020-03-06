package com.komorebishao1;
//成员内部类

//外部类 只能使用public 和 default
public class Outer {
    static String nameString;
    int age=20;
    public static void outerShow() {
    }
    public void show() {
        System.out.println("外部类的show");
    }
    //成员内部类，可用修饰符：public default private protected
    //跟外部类成员是同一级别
    //可以访问外部类的属性(包含静态)和方法（包含静态）
    public class Inner{
        int age = 222;
        //static String sexString;成员内部类不能使用static关键字修饰
//		public static void show() {
//		}成员内部类中不能使用static关键字修饰
        public void show() {
            System.out.println("inner show 方法");
            System.out.println(nameString);//调用外部类属性
            System.out.println(age);//内部类中的age
            //当内部类中属性与外部类属性相同时调用外部类属性
            //外部类名.this.属性名
            System.out.println(Outer.this.age);
            outerShow();//调用外部类方法
            //调用外部类中的同名方法
            Outer.this.show();
        }
    }
    public static void main(String[] args) {
        //Inner inner = new Inner();内部类不能直接这样实例化
        //成员内部类 创建对象的步骤，依附于外部类
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();
    }
}
