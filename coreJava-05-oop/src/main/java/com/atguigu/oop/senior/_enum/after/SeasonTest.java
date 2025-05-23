package com.atguigu.oop.senior._enum.after;

public class SeasonTest {
    public static void main(String[] args) {
        System.out.println("Season.SPRING.getClass() = " + Season.SPRING.getClass());
        System.out.println("Season.SPRING.getClass().getSuperclass() = " + Season.SPRING.getClass().getSuperclass());
        System.out.println("Season.SPRING.getClass().getSuperclass().getSuperclass() = " + Season.SPRING.getClass().getSuperclass().getSuperclass());

        System.out.println();

        for (Season season : Season.values()) {
            System.out.println(season.ordinal() + " - " + season.name());
            season.show();

            System.out.println();
        }
    }
}
