package com.kimtian.test.duotai;

/**
 * 静态内部类test
 *
 * @author kimtian
 **/
public class HelloWorld {
    /**
     * 外部类中的静态变量score
     */
    private static int score = 84;

    /**
     * 创建静态内部类
     */
    public static class StaticInner {
        /**
         * 内部类中的变量score
         */
        int score = 91;

        public void show() {
            System.out.println("访问外部类中的score：" + HelloWorld.score);
            System.out.println("访问内部类中的score：" + score);
        }
    }

    public class Inner {
        /**
         * 内部类中的变量score
         */
        int score = 91;

        public void show() {
            System.out.println("访问外部类中的score：" + HelloWorld.score);
            System.out.println("访问内部类中的score：" + score);
        }
    }

    /**
     * 测试静态内部类
     */
    public static void main(String[] args) {
        // 直接创建内部类的对象
        HelloWorld helloWorld = new HelloWorld();
        Inner i = helloWorld.new Inner();
        // 调用show方法
        i.show();

        StaticInner sInner = new StaticInner();
        sInner.show();
    }
}
