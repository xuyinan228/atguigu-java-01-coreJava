package com.atguigu.oop.senior._static;

public class StaticTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese(40, "姚明");
        Chinese c2 = new Chinese(39, "刘翔");

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        System.out.println();

        Chinese.setNation("China");

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
    }
}
