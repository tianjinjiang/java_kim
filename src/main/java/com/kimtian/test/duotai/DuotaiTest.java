package com.kimtian.test.duotai;

/**
 * 多态测试类
 *
 * @author kimtian
 **/
public class DuotaiTest {
    public static void main(String[] args) {
        //父类的引用可以指向本类的对象
        Animal animal = new Animal();
        //父类的引用可以指向子类的对象
        Animal dog = new Dog();
        System.out.println("=================");
        System.out.println(dog);
        System.out.println("=================");
        Dog dog1 = new Dog();
        //自动类型提升  向上类型转换（隐式，自动类型转换），是小类型到大类型的转换（无风险）
        Animal animal1 = dog1;
        //向下类型转换（强制类型转换），是大类型到小类型的转换（有风险）
        Dog dog2 = (Dog) animal1;
        //使用instance of运算符，来解决引用对象的类型，避免类型转换的安全性问题
        if (animal1 instanceof Dog) {
            Dog dog3 = (Dog) animal1;
        } else {
            System.out.println("无法转换成Dog");
        }
        if (animal1 instanceof Cat) {
            Cat cat2 = (Cat) animal1;
        } else {
            System.out.println("无法转换成Cat");
        }
        //错误的用法，子类的引用不可以指向父类的对象
        //Dog dog1 = new Animal();

         Animal cat = new Cat();
        //创建本类对象时，调用的方法为本类方法
        animal.eat();
        //创建子类对象时，调用的方法为子类重写的方法或继承的方法（狗重写了吃的方法）
        dog.eat();

        //创建子类对象时，调用的方法为子类重写的方法或继承的方法（猫未重写吃的方法，是继承的父类的吃的方法）
        cat.eat();
        dog1.watchDoor();
        //不能调用子类独有的方法
        //dog.watchDoor();
    }
}
