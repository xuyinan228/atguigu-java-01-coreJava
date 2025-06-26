package com.atguigu.collection.collection;

import com.atguigu.collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionTest {

    @Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(123);
        coll.add("尚硅谷");
        coll.add(new Object());
        coll.add(new Person("Tom", 12));

        System.out.println("coll = " + coll);
        System.out.println("coll.size() = " + coll.size());

        System.out.println();

        Collection coll2 = new ArrayList();
        coll2.add("BB");
        coll2.add(456);

        coll.add(coll2);
        //coll.addAll(coll2);
        System.out.println("coll = " + coll);
        System.out.println("coll.size() = " + coll.size());
    }

    @Test
    public void test2() {
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(123);
        coll.add(new String("尚硅谷"));
        coll.add(new Person("Tom", 12));

        System.out.println("coll.isEmpty() = " + coll.isEmpty());
        System.out.println("coll.contains(\"AA\") = " + coll.contains("AA"));
        System.out.println("coll.contains(123) = " + coll.contains(123));
        System.out.println("coll.contains(128) = " + coll.contains(128));
        System.out.println("coll.contains(\"尚硅谷\") = " + coll.contains("尚硅谷"));
        System.out.println("coll.contains(new Person(\"Tom\", 12)) = " + coll.contains(new Person("Tom", 12)));

        Collection coll2 = new ArrayList();
        coll.add("AA");
        coll2.add("BB");

        System.out.println("coll.containsAll(coll2) = " + coll.containsAll(coll2));
    }

    @Test
    public void test3() {
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(123);
        coll.add("AA");
        coll.add(new String("尚硅谷"));
        coll.add(new Person("Tom", 12));

        //coll.clear();
        System.out.println("coll = " + coll);
        System.out.println("coll.size() = " + coll.size());

        coll.remove("AA");

        System.out.println("coll = " + coll);
    }

    @Test
    public void test4() {
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(123);
        coll.add("AA");
        coll.add(new String("尚硅谷"));
        coll.add(new Person("Tom", 12));

        Object[] array = coll.toArray();
        System.out.println("array = " + Arrays.toString(array));
    }

    @Test
    public void test5() {
        String[] arr = new String[]{"AA", "BB", "CC"};
        Collection list = Arrays.asList(arr);
        System.out.println("list = " + list);

        List list2 = Arrays.asList("AA", "BB", "CC", "DD");
        System.out.println("list2 = " + list2);
    }

    @Test
    public void test6() {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        Collection list = Arrays.asList(arr);
        System.out.println("list = " + list);

        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        Collection list2 = Arrays.asList(arr2);
        System.out.println("list2 = " + list2);
    }
}
