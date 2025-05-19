package com.atguigu.oop.senior._abstract;

public class Student extends Person {
    private String school;

    public Student() {}

    public Student(int age, String name, String school) {
        super(age, name);
        this.school = school;
    }

    @Override
    public void eat() {
        System.out.println("学生多吃有营养的食物");
    }

    @Override
    public void sleep() {
        System.out.println("学生要有充足的睡眠");
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
