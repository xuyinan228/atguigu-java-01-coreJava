package com.atguigu.io.stream;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("coreJava-11-io/log.txt", true), true)) {
            System.setOut(ps);

            String line;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while ((line = br.readLine()) != null) {
                System.out.println(line.toUpperCase());
                if( "exit".equals(line)){
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
