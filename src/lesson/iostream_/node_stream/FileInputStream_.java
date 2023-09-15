package lesson.iostream_.node_stream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void readFile01() throws FileNotFoundException {
        String filePath = "D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\iostream_file\\new.txt";
        int readData = 0;

        FileInputStream fileInputStream = new FileInputStream(filePath);

        try {
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    @Test
    public void readFile02() throws IOException {
        String filePath = "D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\iostream_file\\new.txt";
        int readData = 0;
        //byte array
        byte[] buf = new byte[8];

        FileInputStream fileInputStream = new FileInputStream(filePath);

        try {
            while ((fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf, 0, buf.length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件，释放资源
            fileInputStream.close();

        }


    }
}

















