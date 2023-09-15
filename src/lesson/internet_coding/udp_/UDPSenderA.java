package lesson.internet_coding.udp_;

import java.io.IOException;
import java.net.*;

public class UDPSenderA {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9998);

        byte[] data = "hello~, my friend".getBytes();

        DatagramPacket datagramPacket = new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 9999);

        datagramSocket.send(datagramPacket);
    }
}
