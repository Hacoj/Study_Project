package lesson.internet_coding.socket_;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP03Server{
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Server opened....");
        Socket accept = serverSocket.accept();

        InputStreamReader inputStreamReader = new InputStreamReader(accept.getInputStream());
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(accept.getOutputStream());

        int readLen = 0;
        char[] buf = new char[1024];
        while((readLen = inputStreamReader.read(buf)) != -1){
            System.out.println("........");
            System.out.print(new String(buf, 0, readLen));
        }
        accept.shutdownInput();
        System.out.println("Server input over....");


        outputStreamWriter.write("hello,client");
        outputStreamWriter.flush();
        accept.shutdownOutput();
        System.out.println("Server output over....");


        inputStreamReader.close();
        accept.close();
        serverSocket.close();

        System.out.println("Server closeed....");

    }
}


























