package com.kimtian.test.duotai.abstractclass;
/**
 * 图形抽象类父类
 * @author kim
 **/
public abstract class AbstractGraph {
    /**
     * 获取图形的面积方法
     * @param r 圆的半径
     * @return double 图形的的面积
     **/
    public abstract double area(double r);
    /**
     * 获取图形的周长方法
     * @param r 圆的半径
     * @return double 图形的长度
     **/
    public abstract double length(double r);

    public void ifGraph(){
        System.out.println("都是图形");
    }
}
