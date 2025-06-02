package com.atguigu._throw;

public class ThrowTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.register(10L);

        System.out.println(student);

        student.register(-10L);

        System.out.println(student);
    }
}
