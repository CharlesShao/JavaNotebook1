package com.komorebishao3;
public class Master {
    //给宠物喂食的方法
    public void feed(Pet p1) {
        p1.eat();
    }

    //根据编号得到不同的动物 num编号 1狗狗 2猫咪
    //多态的第二种形式，以父类型当作方法的返回值类型
    public Pet getPet(int num) {
        if (num == 1) {
            return new Dog();
        }else if(num == 2){
            return new Cat();
        }else {
            return null;
        }
    }

    //与宠物玩耍的功能
    //向下转型 调用子类特有的属性和方法 父类对象转成子类类型 属于强转
    //向下转型的前提必须要先向上转型，才能实现
    //Pet p1 = new Dog();
    //Dog d1 = (Dog)p1;
    //等价于：Pet p1 = new Dog();
    public void play(Pet p1) {
        if (p1 instanceof Dog) {
            Dog dog = (Dog)p1;
            //子类特有的方法
            dog.catchingPlay();
        }else if(p1 instanceof Cat) {
            Cat cat = (Cat)p1;
            cat.catchMouse();
        }
    }

    public static void main(String[] args) {
        Master xiaomingMaster = new Master();
        Dog xiaobaiDog = new Dog();
        xiaobaiDog.nameString = "xiaobai";
        xiaomingMaster.feed(xiaobaiDog);
        Cat xiaohuaCat = new Cat();
        xiaohuaCat.nameString = "xiaohua";
        xiaomingMaster.feed(xiaohuaCat);//Pet p1 = new Cat();

        //根据编号得到宠物
        //向上转型
        Pet p1 = xiaomingMaster.getPet(2);

        //主人与宠物玩耍
        Dog dog = new Dog();
        xiaomingMaster.play(dog);
        Cat cat = new Cat();
        xiaomingMaster.play(cat);
    }
}