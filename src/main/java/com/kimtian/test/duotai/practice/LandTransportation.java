package com.kimtian.test.duotai.practice;
/**
 * 陆地交通工具类
 * @author kimtian
 **/
public class LandTransportation extends Transportation {
    @Override
    public void transport(String name, int num) {
        System.out.println("我是一种陆地交通方式，我是" + name + ",可以载客" + num + "人。");
    }
}
