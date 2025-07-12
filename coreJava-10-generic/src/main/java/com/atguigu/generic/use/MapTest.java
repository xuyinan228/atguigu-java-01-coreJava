package com.atguigu.generic.use;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

    @Test
    public void testAfter() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Tom", 67);
        map.put("Jerry", 78);
        map.put("Jack", 98);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
