package lesson.internet_coding.udp_;

import java.io.IOException;
import java.net.*;

public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9995);

        byte[] data = "勇敢勇敢我的朋友！".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(data, data.length, InetAddress.getLocalHost(),9997);

        datagramSocket.send(datagramPacket);
    }
}
