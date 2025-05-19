package com.atguigu.oop.advance.object.equals;

public class EqualsTest {
    public static void main(String[] args) {
        User u1 = new User(18, "Tom");
        User u2 = new User(18, "Tom");

        System.out.println("u1.equals(u2) = " + u1.equals(u2));
    }
}
