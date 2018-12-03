package com.kimtian.test.duotai;
/**
 * 重写Equals方法
 *
 * @author kimtian
 **/
public class EqualsTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        if (dog1.equals(dog2)){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
        if (dog1==dog2){
            System.out.println("==相等");
        }
        else{
            System.out.println("==不相等");
        }
    }
}
