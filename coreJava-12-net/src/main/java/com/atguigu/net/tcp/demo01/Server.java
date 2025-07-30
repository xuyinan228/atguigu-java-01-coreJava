package com.atguigu.net.tcp.demo01;

import com.atguigu.net.IOUtils;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("服务端启动完成");
            socket = serverSocket.accept();
            System.out.println("收到了来自" + socket.getInetAddress() + ":" + socket.getPort() + "的连接");

            inputStream = socket.getInputStream();
            System.out.println("收到客户端发来消息：" + IOUtils.read(inputStream));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            IOUtils.close(inputStream, socket, serverSocket);
        }
    }
}
