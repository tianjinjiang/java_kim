package com.kimtian.test.duotai.interfacepractice;

/**
 * 接口测试类
 *
 * @author kimtian
 **/
public class Test {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.callPhhone();
        PlayGame playGame = new SmartPhone();
        playGame.playGames();
        PlayGame playGame1 = new Psp();
        playGame1.playGames();

        //匿名类的两种用法
        PlayGame playGame2 = new PlayGame() {
            @Override
            public void playGames() {
                System.out.println("传说中的匿名类实现玩游戏功能");
            }
        };
        playGame2.playGames();

        new PlayGame() {
            @Override
            public void playGames() {
                System.out.println("传说中的匿名类实现玩游戏功能2");
            }
        }.playGames();

    }
}
