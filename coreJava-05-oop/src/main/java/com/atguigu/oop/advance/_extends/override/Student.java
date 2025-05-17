package com.atguigu.oop.advance._extends.override;

public class Student extends Person {
    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void eat() {
        System.out.println("学生应该多吃有营养的食物");
    }

    public void study() {
        System.out.println("学生学习");
    }
}
