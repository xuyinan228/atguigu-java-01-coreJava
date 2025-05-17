package com.atguigu.oop.advance._super;

public class SuperTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("circle.findArea() = " + circle.findArea());

        System.out.println();

        Cylinder cylinder = new Cylinder();
        System.out.println("cylinder.findArea() = " + cylinder.findArea());
        System.out.println("cylinder.findVolume() = " + cylinder.findVolume());
    }
}
