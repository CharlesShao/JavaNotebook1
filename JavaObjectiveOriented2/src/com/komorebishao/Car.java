package com.komorebishao;

public class Car {
    //属性：颜色 品种 名字
    //封装第一步：把变量私有化
    private String color;
    private String type;
    private String name;
    private int age;
    //把类的细节隐藏，使得只能通过特定方式操作类中的变量，限制不合理操作

    //第二步：书写set和get方法
    //set 赋值方法 因为属性被隐藏 set则是为每个属性赋值 因此一个属性对应一个set
    //set是有参无返回值方法
    public void setColor(String color) {
        this.color = color;
    }
    //get取值方法
    //get是无参有返回方法
    public String getColor() {
        return color;
    }
    //年龄不得小于0，才能给当前对象的age属性赋值
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }else {
            System.out.println("年龄不能小于0！");
        }
    }
    public int getAge() {
        return age;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
