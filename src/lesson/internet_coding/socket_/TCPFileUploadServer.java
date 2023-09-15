package lesson.internet_coding.socket_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPFileUploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        String fileUpload = "D:\\PrFiles\\素材\\QQ录屏20230802201947____1.mp4";
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileUpload));
        System.out.println("Server prepared...");

        byte[] buf = new byte[1024];
        int readLen = 0;
        while((readLen = inputStream.read(buf)) != -1){
            bufferedOutputStream.write(buf,0, readLen);
        }
        bufferedOutputStream.flush();

        System.out.println("Copying completed...");

        bufferedOutputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
