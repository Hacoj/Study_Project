package lesson.internet_coding.socket_;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());

        System.out.println("Client opened...");

        outputStreamWriter.write("hello,server");
        outputStreamWriter.flush();
        socket.shutdownOutput();
        System.out.println("Client output over...");

        char[] buf = new char[1024];
        int readLen = 0;
        while((readLen = inputStreamReader.read(buf)) != -1){
            System.out.println("........");
            System.out.println(new String(buf,0,readLen));
        }
        socket.shutdownInput();
        System.out.println("Client input over...");

        inputStreamReader.close();
        socket.close();
        System.out.println("Client closed...");
    }
}































