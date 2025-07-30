package com.atguigu.net.tcp.demo02;

import com.atguigu.net.IOUtils;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream socketIps = null;
        OutputStream fops = null;
        OutputStream socketOps = null;

        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("服务端启动完成");

            socket = serverSocket.accept();
            System.out.println("收到了来自" + socket.getInetAddress() + ":" + socket.getPort() + "的连接");

            socketIps = socket.getInputStream();

            fops = Files.newOutputStream(Paths.get("coreJava-12-net/server-" + UUID.randomUUID() + ".dat"));
            IOUtils.copy(socketIps, fops);

            socketOps = socket.getOutputStream();
            socketOps.write("文件接收成功".getBytes());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            IOUtils.close(socketOps, fops, socketIps, socket, serverSocket);
        }
    }
}
