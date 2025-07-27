package com.atguigu.io.stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWriterTest {
    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            copy("coreJava-11-io/baidu.html", "coreJava-11-io/baidu_huge.html");
        }
    }

    public static void copy(String source, String dest) {
        int len;
        char[] buffer = new char[1024];
        try(FileReader reader = new FileReader(source);
            FileWriter writer = new FileWriter(dest)) {

            while ( (len = (reader.read(buffer))) != -1 ) {
                writer.write(buffer, 0, len);
            }
            writer.flush();
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(new File(source).length());
        System.out.println(new File(dest).length());
    }
}
