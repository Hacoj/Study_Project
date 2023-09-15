package lesson.internet_coding.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);

        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        byte[] buf = new byte[1024];
        int readLen = 0;

        while((readLen = inputStream.read(buf))!= -1){
            System.out.print(new String(buf, 0 ,readLen));
        }
        socket.shutdownInput();

        outputStream.write(buf);
        socket.shutdownOutput();

        inputStream.close();
        outputStream.close();
        socket.close();

        System.out.println("\nClient exit...");
    }
}
