package com.atguigu.oop.advance.object.clone;

public class Animal implements Cloneable {
    private String name;

    public Animal() {}
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
