package com.komorebishao;

//定义一个人 "类"
public class Person {
    //人的特征===>类中成员变量，也叫属性：身高 体重 颜值
    //人的行为===>类中方法：吃饭 睡觉 散步

    //成员变量定义在类的内部，方法的外部
    //默认值 double-0.0 flout-0.0f int-0 char-空字符 引用类型-null
    double height;//身高
    double weight;//体重
    int age;//年龄
    String name;

    //成员方法 非静态方法
    //吃饭
    public void eat(int num) {
        System.out.println("吃了" + num + "碗饭");
    }
    //睡觉
    public void sleep() {
        System.out.println("睡觉");
    }
    //散步
    public void walkOut() {
        System.out.println("散步");
    }

    public static void main(String[] args) {
        //声明Person对象
        Person zhangSan;
        //创建对象
        zhangSan = new Person();
        //使用对象 com.komorebishao.Person@61bbe9ba 内存地址
        System.out.println(zhangSan);

        //如何使用对象中的属性和方法
        //给对象中属性赋值 调用属性 对象名.属性名
        zhangSan.name = "张三";
        zhangSan.age = 25;
        zhangSan.height = 175;
        zhangSan.weight = 88.8;

        //输出对象中的属性
        System.out.println(zhangSan.name);

        //如何调用对象中的方法
        zhangSan.eat(2);
        zhangSan.walkOut();
        zhangSan.sleep();
    }
}
