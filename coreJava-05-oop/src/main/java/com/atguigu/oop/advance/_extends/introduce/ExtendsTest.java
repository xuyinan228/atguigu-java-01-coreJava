package com.atguigu.oop.advance._extends.introduce;

public class ExtendsTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Tom");
        person.eat();

        System.out.println();

        Student student = new Student();
        student.setName("Jerry");
        student.eat();

        System.out.println();

        System.out.println("person.getClass().getSuperclass() = " + person.getClass().getSuperclass());
        System.out.println("student.getClass().getSuperclass() = " + student.getClass().getSuperclass());

    }
}
