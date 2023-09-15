package lesson.iostream_.processing_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\iostream_file\\text.txt";
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(path,true),"gbk");

        outputStreamWriter.write(" 说的太好辣！");

        outputStreamWriter.close();
    }
}
