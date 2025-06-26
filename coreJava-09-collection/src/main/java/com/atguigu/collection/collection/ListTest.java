package com.atguigu.collection.collection;

import com.atguigu.collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

    @Test
    public void test1() {
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add(123);
        list.add("BB");
        list.add(new Person("Tom", 12));
        list.add(2);

        System.out.println("list = " + list);

        list.add(2, "CC");
        System.out.println("list = " + list);

        List list1 = Arrays.asList(1, 2, 3);
        //list.addAll(1, list1);
        //System.out.println("list = " + list);

        list.add(1, list1);
        System.out.println("list = " + list);

        // 删除索引为2的数据
        list.remove(2);
        System.out.println("list = " + list);

        // 删除值为2的数据
        list.remove((Integer)2);
        System.out.println("list = " + list);
    }
}
