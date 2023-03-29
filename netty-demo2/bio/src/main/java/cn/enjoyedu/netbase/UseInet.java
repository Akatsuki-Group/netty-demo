package cn.enjoyedu.netbase;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class UseInet {
    public UseInet() {
    }

    public static void main(String[] args) throws UnknownHostException {
        InetAddress[] allByName = InetAddress.getAllByName("www.baidu.com");
        InetAddress[] var2 = allByName;
        int var3 = allByName.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            InetAddress addr = var2[var4];
            System.out.println(addr);
        }

        byte[] bytes = new byte[]{-64, -88, 56, 1};
        InetAddress byAddress = InetAddress.getByAddress(bytes);
    }
}