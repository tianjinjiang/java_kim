package com.kimtian.test.duotai.practice;
/**
 * 飞行交通工具类
 * @author kimtian
 **/
public class FlyTransportation extends Transportation{
    @Override
    public void transport(String name,int num){
        System.out.println("我是一种飞行交通方式，我是"+name+"可以载客"+num+"人。");
    }
}
