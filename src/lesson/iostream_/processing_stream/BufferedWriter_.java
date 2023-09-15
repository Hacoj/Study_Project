package lesson.iostream_.processing_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Project\\IDEA_Project\\Study_Project\\src\\lesson.iostream_\\processing_stream\\bufferedwriter_\\BufferedWriter_.java";

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path,true));

        bufferedWriter.write("//写入的文本：\n");

        bufferedWriter.close();
    }
}
//写入的文本：
