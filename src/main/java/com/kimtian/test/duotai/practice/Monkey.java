package com.kimtian.test.duotai.practice;

/**
 * 猴子类
 *
 * @author kimtian
 **/
public class Monkey {
    private final int num;

    public Monkey() {
        num = 20;
    }

    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        System.out.println(monkey.num);
    }
}
