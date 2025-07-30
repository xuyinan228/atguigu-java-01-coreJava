package com.atguigu.net.udp;

import com.atguigu.net.IOUtils;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(8888);

            byte[] buf = new byte[1024 * 64];
            DatagramPacket packet = new DatagramPacket(buf, 0 , buf.length);
            socket.receive(packet);

            System.out.println("接收到消息：" + new String(packet.getData(), 0, packet.getLength()));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            IOUtils.close(socket);
        }
    }
}
