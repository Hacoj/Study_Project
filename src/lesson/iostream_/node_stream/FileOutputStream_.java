package lesson.iostream_.node_stream;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile() throws IOException {
        //创建文件
        String filePath = "D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\iostream_file\\new_3.txt";
        FileOutputStream fileOutputStream = null;

        fileOutputStream = new FileOutputStream(filePath);

        String str = "hello world";
        fileOutputStream.write('a');
        fileOutputStream.write(str.getBytes());
    }
}





























