package com.kimtian.test.duotai.abstractclass;


/**
 * 图形抽象类测试类
 *
 * @author kim
 **/
public class GraphTest {
    public static void main(String[] args) {
        AbstractGraph abstractGraph1 = new AbstractGraph() {
            @Override
            public double area(double r) {
                return 0;
            }

            @Override
            public double length(double r) {
                return 0;
            }
        };
        System.out.println(abstractGraph1.area(1.2));
        System.out.println(abstractGraph1.length(1.2));
        abstractGraph1.ifGraph();
        AbstractGraph abstractGraph2 = new AbstractQuadrilateral() {
            @Override
            public double area(double r) {
                return 0;
            }

            @Override
            public double length(double r) {
                return 0;
            }
        };
        System.out.println(abstractGraph2.area(1));
    }
}
