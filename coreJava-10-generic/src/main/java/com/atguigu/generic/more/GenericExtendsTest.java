package com.atguigu.generic.more;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericExtendsTest {

    @Test
    public void test1() {
        // String[] 是 Object[] 的子类
        Object[] oArr = new String[] {"a", "b", "c"};
    }

    @Test
    public void test2() {
        // ArrayList<String> 是 List<String> 的子类
        List<String> list = new ArrayList<String>();
    }

    @Test
    public void test3() {
        List<Object> objectList = null;
        List<String> stringList = null;

        // List<String> 不是 List<Object>的子类
        //objectList = stringList;

        /*
        * 反证法：
        * 假设 List<String> 是 List<Object>的子类
        *
        * 那么可以实现
        * stringList.add("AA");
        * objectList = stringList;
        * objectList.add(123);
        * String str = objectList.get(1);       // 违背泛型
        * */
    }
}
