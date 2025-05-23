package com.atguigu.oop.senior.innerclazz.local;

public class LocalClassTest {
    public void method() {
        new Comparable<Integer>() {

            @Override
            public int compareTo(Integer o) {
                return 0;
            }
        };
    }
}
