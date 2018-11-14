package com.kimtian.test.duotai.practice;
/**
 * 公共汽车
 * @author kimtian
 **/
public class Car extends Transportation{
    @Override
    public void transport(String name, int num) {
        System.out.println("我是一种陆地交通方式，我是小汽车,可以载客" + num + "人。");
    }
}
