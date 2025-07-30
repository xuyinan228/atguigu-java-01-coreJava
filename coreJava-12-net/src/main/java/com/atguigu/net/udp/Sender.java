package com.atguigu.net.udp;

import com.atguigu.net.IOUtils;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket();
            String message = "Hello， 我是徐依楠";
            byte[] buf = message.getBytes();
            DatagramPacket packet = new DatagramPacket(buf, 0, buf.length, InetAddress.getByName("127.0.0.1"), 8888);
            socket.send(packet);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            IOUtils.close(socket);
        }
    }
}
