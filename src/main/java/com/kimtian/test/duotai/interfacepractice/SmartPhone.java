package com.kimtian.test.duotai.interfacepractice;

/**
 * 智能电话类
 *
 * @author kimtian
 **/
public class SmartPhone extends Cellphone implements PlayGame {
    @Override
    public void playGames() {
        System.out.println("智能电话可以玩游戏！！");
    }

    ;
}
