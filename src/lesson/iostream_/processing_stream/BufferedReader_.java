package lesson.iostream_.processing_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_ {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Project\\IDEA_Project\\Study_Project\\src\\lesson.iostream_\\node_stream\\CreateFile.java";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
