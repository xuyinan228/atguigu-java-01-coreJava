package com.atguigu.net.tcp.demo01;

import com.atguigu.net.IOUtils;

import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            socket = new Socket("127.0.0.1", 8080);
            outputStream = socket.getOutputStream();
            outputStream.write("我是客户端，请多关照".getBytes());
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            IOUtils.close(outputStream, socket);
        }
    }
}
