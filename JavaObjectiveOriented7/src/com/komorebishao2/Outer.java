package com.komorebishao2;

//局部内部类
public class Outer {
    int height = 12;
    static String passwordString = "12345";
    public void show() {
        int age = 0;
        String sexString = "男";
        //局部内部类，只能使用默认权限修饰符修饰类
        class Inner{
            //局部内部类 内部不能使用静态关键字
            //局部内部类 可以访问方法中的局部变量
            //局部内部方法与局部变量使用范围一样，在此方法内部
            int age =23;
            int height = 14;
            public void show(int age) {
                //同时访问内外重名方法时，访问方法中的局部变量要通过方法参数传递完成
                //否则就会遵循就近原则
                System.out.println(age);
                System.out.println(sexString);
                System.out.println(this.age);
                //局部内部类 可以访问方法外部类中的属性和方法(包含静态)
                System.out.println(passwordString);
                //外部类与内部类重名时，使用 外部类.this.成员名(方法名())
                System.out.println(Outer.this.height);
            }
        }
        //局部内部类创建对象要在方法内部，局部内部类的外部声明
        Inner n1 = new Inner();
        n1.show(age);
    }
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();
        //不能在局部内部类所处的方法外部创建对象
        //Inner i1 = new Inner();
    }
}