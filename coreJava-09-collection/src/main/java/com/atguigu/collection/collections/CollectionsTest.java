package com.atguigu.collection.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    @Test
    public void test1() {
        List list = Arrays.asList(45, 43, 65, 6, 43, 2, 32, 45, 56, 34, 23);
        System.out.println("list = " + list);

        Collections.reverse(list);

        System.out.println("list = " + list);

        Collections.shuffle(list);

        System.out.println("list = " + list);

        Collections.sort(list);

        System.out.println("list = " + list);

        System.out.println("Collections.max(list) = " + Collections.max(list));

        System.out.println("Collections.min(list) = " + Collections.min(list));

        List dest = new ArrayList(list);
        System.out.println("dest = " + dest);
    }
}
