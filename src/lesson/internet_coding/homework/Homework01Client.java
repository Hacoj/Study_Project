package lesson.internet_coding.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Homework01Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        System.out.println(1);

        int readLen = 0;
        String name = "name";
        String hobby = "hobby";
        byte[] buf = new byte[1024];

        int count = 0;
        while (count != 2)
            label1:{

                while ((readLen = bufferedInputStream.read(buf)) != -1) {
                    System.out.println(1);

                    if (new String(buf, 0, readLen).equals(name)) {
                        bufferedOutputStream.write("I am Nova".getBytes());
                        bufferedOutputStream.flush();
                        count++;
                        if (count == 2) {
                            break label1;
                        }
                    } else if (new String(buf, 0, readLen).equals(hobby)) {
                        bufferedOutputStream.write("Writing Java programs".getBytes());
                        bufferedOutputStream.flush();
                        count++;
                        if (count == 2) {
                            break label1;
                        }
                    } else {
                        bufferedOutputStream.write("What are you saying?".getBytes());
                        bufferedOutputStream.flush();
                    }
                }
            }

        bufferedInputStream.close();
        bufferedOutputStream.close();
        socket.close();

    }
}
