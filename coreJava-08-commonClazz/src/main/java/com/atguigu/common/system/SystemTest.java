package com.atguigu.common.system;

import org.junit.Test;

public class SystemTest {

    @Test
    public void testGetProperty() {
        String[] properties = {
                "java.version",
                "java.home",
                "os.name",
                "os.version",
                "user.name",
                "user.home",
                "user.dir"
        };
        for (String property : properties) {
            System.out.println(property + " : " + System.getProperty(property));
        }
    }
}
