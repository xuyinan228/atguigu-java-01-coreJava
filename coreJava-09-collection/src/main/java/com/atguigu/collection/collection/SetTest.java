package com.atguigu.collection.collection;

import com.atguigu.collection.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {

    @Test
    public void test1() {
        //Set set = new HashSet();
        Set set = new LinkedHashSet();
        set.add("AA");
        set.add(123);
        set.add("BB");
        set.add(new Person("Tom", 12));

        for (Object obj : set) {
            System.out.println(obj);
        }

        System.out.println();

        System.out.println("set.contains(new Person(\"Tom\", 12)) = " + set.contains(new Person("Tom", 12)));
    }
}
