package com.atguigu.net.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("192.168.0.1");
            System.out.println("address = " + address);

            address = InetAddress.getByName("www.atguigu.com");
            System.out.println("address = " + address);

            address = InetAddress.getLocalHost();
            System.out.println("address = " + address);

            System.out.println("address.getHostName() = " + address.getHostName());
            System.out.println("address.getHostAddress() = " + address.getHostAddress());

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
