package com.atguigu.generic.more;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest {

    @Test
    public void testWrite() {
        List<?> list = new ArrayList<>();

        // null 是所有引用类型的默认值
        list.add(null);

        // list.add("AA");                  编译失败
        // list.add(new Object());          编译失败
    }

    @Test
    public void testRead() {
        List<?> list = new ArrayList<String>();
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
