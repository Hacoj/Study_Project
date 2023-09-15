package lesson.internet_coding.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Homework01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();

        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());

        int count = 0;
        bufferedOutputStream.write("name".getBytes());
        bufferedOutputStream.flush();

        System.out.println(1);

        byte[] data = new byte[1024];
        int readLen = 0;
        while (count != 3)
            label1:{
                while ((readLen = bufferedInputStream.read(data)) != -1) {
                    System.out.println(1);

                    if (new String(data, 0, readLen).equals("What are you saying?")) {
                        switch (count) {
                            case 2:
                                bufferedOutputStream.write("name".getBytes());
                                break;
                            case 1:
                                bufferedOutputStream.write("hobby".getBytes());
                                break;
                        }
                    } else if (new String(data, 0, readLen).equals("I am Nova")) {
                        System.out.println("I am Nova");
                        count += 1;
                        if (count == 3) {
                            break label1;
                        }
                    } else if (new String(data, 0, readLen).equals("Writing Java programs")) {
                        System.out.println("Writing Java programs");
                        count += 2;
                        if (count == 3) {
                            break label1;
                        }
                    } else {
                        System.out.println(new String(data, 0, readLen));
                    }
                }
            }

        bufferedOutputStream.close();
        bufferedInputStream.close();
        socket.close();
        serverSocket.close();

    }
}
