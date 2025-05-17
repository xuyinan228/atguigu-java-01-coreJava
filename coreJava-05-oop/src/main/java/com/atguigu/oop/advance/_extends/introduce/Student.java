package com.atguigu.oop.advance._extends.introduce;

public class Student extends Person {
    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void study() {
        System.out.println("学生学习");
    }
}
