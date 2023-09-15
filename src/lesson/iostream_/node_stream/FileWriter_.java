package lesson.iostream_.node_stream;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {

    }

    @Test
    public void fileWriter() throws IOException {
        FileWriter fileWriter = null;

        fileWriter = new FileWriter("D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\iostream_file\\new_1.txt",true);

        char[] c =new char[2];
        c[0] = 'r';
        c[1] = ',';
        fileWriter.write('c');
        fileWriter.write("ha");
        fileWriter.write(c);
        fileWriter.write("ShenJiansongadsf",0,12);
        fileWriter.write(",ShenJiansongadsf".toCharArray(),0,13);

        fileWriter.close();
    }
}
