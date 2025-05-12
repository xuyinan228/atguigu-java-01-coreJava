package com.atguigu.oop.basic.introduce;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.name = "华为 Mate50";
        phone.price = 6999;
        System.out.println("phone name: " + phone.name + ", phone.price: " + phone.price);

        phone.call();

        phone.sendMessage("有内鬼，终止交易");

        phone.playGame();

    }
}
