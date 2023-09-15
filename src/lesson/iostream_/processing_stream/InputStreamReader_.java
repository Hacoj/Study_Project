package lesson.iostream_.processing_stream;

import java.io.*;

public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\iostream_file\\text.txt";

        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(path), "GBK");

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String s = bufferedReader.readLine();
        System.out.println(s);

        bufferedReader.close();

    }
}
