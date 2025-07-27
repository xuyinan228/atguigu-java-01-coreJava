package com.atguigu.io.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemStreamTest {
    public static void main(String[] args) throws IOException {
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while ( null != (line = reader.readLine()) ) {
            if( "e".equals(line) || "exit".equals(line) ) {
                break;
            }
            System.out.println(line.toUpperCase());
        }
    }
}
