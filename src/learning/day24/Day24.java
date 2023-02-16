package learning.day24;

import java.net.InetAddress;
import java.nio.*;
public class Day24 {

    public static void main(String[] args) {
//        InetAddress address = InetAddress.getByName("www.packtpub.com");
//        System.out.println(address);
    }

    private static void displayInetAddressInformation(InetAddress address) {
        System.out.println(address);
        System.out.println("CanonicalHostName: " + address.getCanonicalHostName());
        System.out.println("HostName: " + address.getHostName());
        System.out.println("HostAddress: " + address.getHostAddress());
    }
}