package com.kimtian.test.duotai;
/**
 * 狗子类
 * @author kimtian
 **/
public class Dog extends Animal {
    /**
     * 重写父类吃的方法
     **/
    @Override
    public void eat() {
        System.out.println("狗是吃肉的");
    }
    /**
     * 狗独有的看门的方法
     **/
    public void watchDoor() {
        System.out.println("狗是可以看门的");
    }
}
