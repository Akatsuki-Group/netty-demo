package cn.enjoyedu.netbase;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class UseNetIf {
    public UseNetIf() {
    }

    public static void main(String[] args) throws SocketException, UnknownHostException {
        InetAddress address = InetAddress.getByName("127.0.0.1");
        NetworkInterface byInetAddress = NetworkInterface.getByInetAddress(address);
        System.out.println(byInetAddress);
        System.out.println("-----------------------------");
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();

        while(networkInterfaces.hasMoreElements()) {
            NetworkInterface networkInterface = (NetworkInterface)networkInterfaces.nextElement();
            System.out.println(networkInterface + "===============");
            Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();

            while(inetAddresses.hasMoreElements()) {
                System.out.println(networkInterface.getDisplayName() + "-" + inetAddresses.nextElement());
            }
        }

    }
}