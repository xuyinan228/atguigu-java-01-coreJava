package com.atguigu.net.tcp.demo02;

import com.atguigu.net.IOUtils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream socketOps = null;
        InputStream fips = null;
        InputStream socketIps = null;

        try {
            socket = new Socket("127.0.0.1", 8080);
            socketOps = socket.getOutputStream();
            fips = Files.newInputStream(Paths.get("coreJava-12-net/example.mp4"));
            IOUtils.copy(fips, socketOps);
            socket.shutdownOutput();

            socketIps = socket.getInputStream();
            System.out.println("收到来自服务端的反馈：" + IOUtils.read(socketIps));

        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            IOUtils.close(socketIps, socketOps, fips, socket);
        }
    }
}
