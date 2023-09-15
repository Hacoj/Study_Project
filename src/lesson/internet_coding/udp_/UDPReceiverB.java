package lesson.internet_coding.udp_;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiverB {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9997);

        byte[] buf = new byte[10240];
        DatagramPacket datagramPacket = new DatagramPacket(buf,buf.length);

        datagramSocket.receive(datagramPacket);

        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();

        System.out.println(new String(data, 0, length));
    }
}
