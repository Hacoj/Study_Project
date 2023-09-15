package lesson.internet_coding.socket_;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPFileUploadClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        String fileUpload = "D:\\PrFiles\\素材\\QQ录屏20230802201947.mp4";
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileUpload));
        System.out.println("Client prepared...");

        byte[] buf = new byte[1024];
        int readLen = 0;//parenthesis
        while ((readLen = bufferedInputStream.read(buf)) != -1) {
            outputStream.write(buf, 0, readLen);
        }
        System.out.println("Uploading completed...");

        bufferedInputStream.close();
        outputStream.close();
        socket.close();
    }
}
