package com.atguigu.net.tcp.chatroom;

import com.atguigu.net.IOUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server {
    static List<Socket> clients = new ArrayList<>();


    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8888);
            while (true) {
                Socket socket = serverSocket.accept();
                clients.add(socket);

                new MessageHandler(socket, clients).start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            IOUtils.close(serverSocket);
        }
    }
}

class MessageHandler extends Thread{
    private String socketName;
    private final Socket socket;
    private final List<Socket> clients;

    public MessageHandler(Socket socket, List<Socket> clients) {
        this.socket = socket;
        this.clients = clients;
        this.socketName = socket.getInetAddress().getHostAddress() + ":" + socket.getPort();

        sendToOther(socketName + "上线了");
    }

    @Override
    public void run() {
        InputStream inputStream = null;
        try {
            inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            while ( (line = bufferedReader.readLine()) != null ){
                sendToOther(socketName + ":" + line);
            }

            sendToOther(socketName + "下线了");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            IOUtils.close(inputStream);
        }
    }

    private void sendToOther(String msg) {
        clients.forEach(client -> {
            try {
                OutputStream outputStream = client.getOutputStream();
                PrintStream printStream = new PrintStream(outputStream);
                printStream.println(msg);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
