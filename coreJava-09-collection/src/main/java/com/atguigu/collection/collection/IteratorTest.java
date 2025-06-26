package com.atguigu.collection.collection;

import com.atguigu.collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {

    @Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(123);
        coll.add("AA");
        coll.add(new String("尚硅谷"));
        coll.add(new Person("Tom", 12));

        System.out.println("coll = " + coll);

        Iterator iterator = coll.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
            if (obj.equals("AA")) {
                iterator.remove();
            }
        }
        System.out.println("coll = " + coll);
    }
}
