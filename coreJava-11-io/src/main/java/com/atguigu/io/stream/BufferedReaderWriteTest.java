package com.atguigu.io.stream;

import java.io.*;

public class BufferedReaderWriteTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        FileReadWriterTest.copy("coreJava-11-io/baidu_huge.html", "coreJava-11-io/baidu_huge-copied1.html");
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");

        start = System.currentTimeMillis();
        copy("coreJava-11-io/baidu_huge.html", "coreJava-11-io/baidu_huge-copied2.html");
        end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");
    }

    private static void copy(String sourcePath, String targetPath) {
        String line;
        try(BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(targetPath))) {

            while ( null != (line = reader.readLine()) ) {
                writer.write(line);
            }
            writer.flush();
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(new File(sourcePath).length());
        System.out.println(new File(targetPath).length());
    }
}
