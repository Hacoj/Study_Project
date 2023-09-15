package lesson.internet_coding.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket accept = serverSocket.accept();

        OutputStream outputStream = accept.getOutputStream();
        InputStream inputStream = accept.getInputStream();

        outputStream.write("hello client!".getBytes());
        accept.shutdownOutput();


        byte[] buf = new byte[1024];
        int readLen = 0;
        while((readLen = inputStream.read(buf)) != -1){
            System.out.println(new String(buf, 0 ,readLen));
        }


        accept.shutdownInput();

        outputStream.close();
        accept.close();
        serverSocket.close();

        System.out.println("\nServer exit...");
    }
}
