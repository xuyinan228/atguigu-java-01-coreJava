package com.atguigu.net.tcp.chatroom;

import com.atguigu.net.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1", 8888);

            // 一个线程负责看别人聊 —— 接收服务端转发的消息
            new Receive(socket).start();

            // 一个线程负责发送自己的话
            new Send(socket).start();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            IOUtils.close(socket);
        }
    }
}

class Send extends Thread{
    private Socket socket;

    public Send(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入你想说的：");
            String msg = scanner.nextLine();

            sendMessage(msg, socket);
        }
    }

    private void sendMessage(String msg, Socket socket) {
        OutputStream ops = null;
        try {
            ops = socket.getOutputStream();
            ops.write(msg.getBytes());
            ops.flush();
            socket.shutdownOutput();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            IOUtils.close(ops);
        }
    }
}

class Receive extends Thread{
    private Socket socket;

    public Receive(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        while (true) {
            readSocketInput();
        }
    }

    private void readSocketInput() {
        InputStream ips = null;
        try {
            ips = socket.getInputStream();
            System.out.println( IOUtils.read(ips) );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            IOUtils.close(ips);
        }
    }
}
