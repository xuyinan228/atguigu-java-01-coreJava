package com.atguigu.oop.senior._static;

public class Chinese {
    private int age;
    private String name;
    private static String nation;

    public Chinese() {}
    public Chinese(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setNation(String nation) {
        Chinese.nation = nation;
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                '}';
    }
}
