package com.atguigu.oop.advance._super;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 2;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double findVolume() {
        return super.findArea() * height;
    }

    @Override
    public double findArea() {
        return super.findArea() * 2 + 2 * Math.PI * getRadius() * getHeight();
    }
}
