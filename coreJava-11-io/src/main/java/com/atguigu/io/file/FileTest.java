package com.atguigu.io.file;

import org.junit.Test;

import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class FileTest {
    @Test
    public void test1() {
        File file = new File("/Users/xuyinan/Desktop/依楠SIF2.docx");

        File file2 = new File("abc");
        System.out.println(file2.getAbsoluteFile());

        File file3 = new File("/Users/xuyinan/Desktop", "依楠SIF2.docx");
        File file4 = new File(file.getParentFile(), "依楠SIF2.docx");

        System.out.println("file.equals(file3) = " + file.equals(file3));
        System.out.println("file3.equals(file4) = " + file3.equals(file4));
    }

    @Test
    public void test2() {
        Consumer<File> consumer = file -> {
            System.out.println("file.getName() = " + file.getName());
            System.out.println("file.getPath() = " + file.getPath());
            System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
            System.out.println("file.getAbsoluteFile() = " + file.getAbsoluteFile());
            System.out.println("file.getParent() = " + file.getParent());
            System.out.println("file.length() = " + file.length());
            System.out.println("file.lastModified() = " + file.lastModified());
        };

        File file = new File("hello.txt");
        consumer.accept(file);

        System.out.println();
        System.out.println();


        file = new File("/Users/xuyinan/Sources/study/atguigu/atguigu-java-01-coreJava/coreJava-11-io/hello.txt");
        consumer.accept(file);
    }

    @Test
    public void test3() {
        File file = new File("");
        System.out.println(file.getAbsoluteFile());
        list("", file.getAbsoluteFile());
    }

    public void list(String start, File iterFile) {
        System.out.println(start + iterFile.getName());
        File[] files = iterFile.listFiles();
        if(files == null){
            return;
        }
        for (File subFile : files) {
            list(start + "\t", subFile);
        }
    }

    @Test
    public void test4() {
        File file = new File("hello.txt");
        boolean success = file.renameTo(new File("abc.txt"));

        System.out.println("rename success : " + success);
    }

    @Test
    public void test5() {
        Consumer<File> consumer = file -> {
            System.out.println("file.exists() = " + file.exists());
            System.out.println("file.isDirectory() = " + file.isDirectory());
            System.out.println("file.isFile() = " + file.isFile());
            System.out.println("file.canRead() = " + file.canRead());
            System.out.println("file.canWrite() = " + file.canWrite());
            System.out.println("file.isHidden() = " + file.isHidden());
            System.out.println();
            System.out.println();
        };

        File file = new File("hello.txt");
        consumer.accept(file);



        file = new File("abc.txt");
        consumer.accept(file);

        file = new File("");
        consumer.accept(file);
    }

    @Test
    public void test6() {
        File file = new File("/Users");
        System.out.println("sumSize(file) = " + sumSize(file));
    }

    private long sumSize(File file) {
        long sum = 0;
        File[] files = file.listFiles();
        if(files == null){
            return sum;
        }
        for (File subFile : files) {
            System.out.println(subFile);
            if (subFile.isDirectory()) {
                sum += sumSize(subFile);
            } else {
                sum += subFile.length();
            }
        }
        return sum;
    }

}
