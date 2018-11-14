package com.kimtian.test.duotai.abstractclass;


/**
 * 圆形子类
 *
 * @author kimtian
 **/
public class Round extends AbstractGraph {
    public static final double PAI = 3.1415926;

    @Override
    public double area(double r) {
        return PAI * r * r;
    }

    @Override
    public double length(double r) {
        return 2 * PAI * r;
    }
}
