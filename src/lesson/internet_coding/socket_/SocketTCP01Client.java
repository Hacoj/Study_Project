package lesson.internet_coding.socket_;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        System.out.println("socket = " + socket.toString());

        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("hello, my friend".getBytes());

        outputStream.close();
        socket.close();

        System.out.println("Client is over...");
    }
}
