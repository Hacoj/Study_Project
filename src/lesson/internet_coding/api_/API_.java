package lesson.internet_coding.api_;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = null;
        inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress);

        //InetAddress inetAddress1 = InetAddress.getByName("DESKTOP-91OG5RQ");
        //System.out.println("host1 = " + inetAddress1);

        InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
        System.out.println("host2 = " + inetAddress2);


        String hostAddress2 = inetAddress2.getHostAddress();
        System.out.println("hostAddress2 = " + hostAddress2);

        System.out.println("hostAddress2.name = " + hostAddress2.getBytes());

    }
}



















