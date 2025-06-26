package com.atguigu.collection.collection;

import com.atguigu.collection.Person;
import org.junit.Test;

import java.util.*;

public class SetTest {

    @Test
    public void testHashSet1() {
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

    @Test
    public void testHashSet2() {
        Set set = new HashSet();
        Person p1 = new Person("AA", 1001);
        Person p2 = new Person("BB", 1002);
        set.add(p1);
        set.add(p2);

        System.out.println("set = " + set);

        p1.setName("CC");
        set.remove(p1);

        System.out.println("set = " + set);

        set.add(p1);
        System.out.println("set = " + set);

        set.add(new Person("AA", 1001));
        System.out.println("set = " + set);

    }

    @Test
    public void testTreeSet1() {
        Set set = new TreeSet();
        set.add("CC");
        set.add("AA");
        set.add("DD");
        set.add("MM");
        set.add("GG");
        set.add("SS");
        //set.add(123);

        set.forEach(System.out::println);
    }

    @Test
    public void testTreeSet2() {
        Set set = new TreeSet();
        set.add(new Person("Tom", 23));
        set.add(new Person("Jerry", 43));
        set.add(new Person("Rose", 13));
        set.add(new Person("Jack", 23));
        set.add(new Person("Tony", 33));

        set.forEach(System.out::println);
    }
}
