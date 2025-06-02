package com.atguigu._throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsTest {
    public static void main(String[] args) {
        try {
            test();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void test() throws IOException {
        File file = new File("/Users/mac/Desktop/test.txt");

        FileInputStream fis = new FileInputStream(file);

        int data = fis. read();
        while (data != -1) {
            System.out.print((char) data);
            data = fis.read();
        }

        fis.close();
    }
}
