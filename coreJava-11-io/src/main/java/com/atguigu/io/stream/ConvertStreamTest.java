package com.atguigu.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ConvertStreamTest {

    public static void main(String[] args) {
        int len;
        char[] buffer = new char[1024];
        try(InputStreamReader reader = new InputStreamReader(new FileInputStream("coreJava-11-io/utf8.txt"), "utf-8");
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("coreJava-11-io/gbk.txt"), "gbk")) {
            while ( (len = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
