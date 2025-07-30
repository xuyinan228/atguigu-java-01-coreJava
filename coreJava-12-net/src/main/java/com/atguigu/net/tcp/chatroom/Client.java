package com.atguigu.net.tcp.chatroom;

import com.atguigu.net.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
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
            Send send = new Send(socket);
            send.start();

            send.join();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            IOUtils.close(socket);
        }
    }
}

class Send extends Thread{
    private final Socket socket;

    public Send(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        PrintStream ps = null;
        OutputStream os = null;
        Scanner console = null;
        try {
            os = socket.getOutputStream();
            ps = new PrintStream(os);

            console = new Scanner(System.in);

            while (true) {
                System.out.print("请输入你想说的：");
                String msg = console.nextLine();
                if (msg.equals("bye")) {
                    break;
                }

                ps.println(msg);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            IOUtils.close(console, ps, os);
        }
    }
}

class Receive extends Thread{
    private final Socket socket;

    public Receive(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream ips = null;
        Scanner scanner = null;
        try {
            ips = socket.getInputStream();
            scanner = new Scanner(ips);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            IOUtils.close(scanner, ips);
        }
    }
}
