package com.atguigu.oop.basic.introduce;

public class Phone {
    String name;
    double price;


    public void call() {
        System.out.println("手机能打电话");
    }

    public void sendMessage(String message) {
        System.out.println("发送消息：" + message);
    }

    public void playGame() {
        System.out.println("手机能玩游戏");
    }
}
