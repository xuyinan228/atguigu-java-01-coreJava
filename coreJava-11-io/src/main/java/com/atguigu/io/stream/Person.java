package com.atguigu.io.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private int age;
    private String name;
    private Date birthday;
    //private static String nation = "中国";

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
