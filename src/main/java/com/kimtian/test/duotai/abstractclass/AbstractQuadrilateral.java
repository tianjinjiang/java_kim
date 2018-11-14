package com.kimtian.test.duotai.abstractclass;


/**
 * 四边形抽象类父类
 *
 * @author kim
 **/
public abstract class AbstractQuadrilateral extends AbstractGraph {

    public double area(double a, double b) {
        return a * b;
    }

    public double length(double a, double b) {
        return 2 * (a + b);
    }
}
