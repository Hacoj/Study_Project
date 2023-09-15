package lesson.internet_coding.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        //要求9999端口没有被监听
        ServerSocket serverSocket = new ServerSocket(9999);

        System.out.println("监听9999.....");
        //如果有客户端连接就会返回一个socket对象
        Socket accept = serverSocket.accept();

        System.out.println("socket = " + accept);

        InputStream inputStream = accept.getInputStream();

        byte[] buf = new byte[1024];

        int readLen = 0;

        while ((readLen = inputStream.read(buf)) != -1){
            System.out.print(new String(buf, 0, readLen));
        }

        inputStream.close();
        accept.close();
        serverSocket.close();
    }
}
