package com.atguigu.collection.map;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MapTest {
    @Test
    public void testHashMap(){
        Map map = new HashMap();
        map.put(null, null);
        System.out.println(map);

        Hashtable map2 = new Hashtable();
        map2.put(null, null);
        System.out.println(map2);
    }

    @Test
    public void testTreeMap(){
        TreeMap map = new TreeMap(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        map.put(null, null);
        System.out.println("map = " + map);
    }

    @Test
    public void testProperties() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("info.properties"));

        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }
}
