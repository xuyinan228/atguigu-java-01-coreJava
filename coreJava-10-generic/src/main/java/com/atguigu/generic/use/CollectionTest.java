package com.atguigu.generic.use;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

    @Test
    public void testBefore() {
        List list = new ArrayList();
        list.add(67);
        list.add(78);
        list.add(89);

        // 类型不安全
        list.add("AA");


        for (Object ele : list) {
            int score = (Integer) ele;
            System.out.println(score);
        }
    }

    public void testAfter() {
        List<Integer> list = new ArrayList();
        list.add(67);
        list.add(78);
        list.add(89);

        // 保证类型安全
        //list.add("AA");
        for (Integer score : list) {
            System.out.println("score = " + score);
        }
    }
}
