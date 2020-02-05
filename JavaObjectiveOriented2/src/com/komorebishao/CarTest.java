package com.komorebishao;

public class CarTest {
    public static void main(String[] args) {
        Car xiaoming = new Car();
        //私有化变量之后 外部不可直接访问
        //赋值
        xiaoming.setColor("green");
        //取值
        System.out.println(xiaoming.getColor());
        xiaoming.setAge(-10);
        System.out.println(xiaoming.getAge());//所赋值不满足定义的赋值规则时，还是保持默认值
    }
}
