package com.atguigu.io.stream;

import java.io.*;

public class FileStreamTest {
    public static void main(String[] args) {
        for(int i = 0 ; i < 1000; i++ ) {
            copy("coreJava-11-io/atguigu.mp4", "coreJava-11-io/atguigu-copied.mp4");
        }
    }

    private static void copy(String source, String dest) {
        int len;
        byte[] buffer = new byte[1024];
        try(FileInputStream ips = new FileInputStream(source);
            FileOutputStream ops = new FileOutputStream(dest)) {

            while ( (len = (ips.read(buffer))) != -1 ) {
                ops.write(buffer, 0, len);
            }
            ops.flush();
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(new File(source).length());
        System.out.println(new File(dest).length());
    }
}
