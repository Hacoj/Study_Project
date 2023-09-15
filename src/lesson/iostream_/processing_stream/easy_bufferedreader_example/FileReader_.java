package lesson.iostream_.processing_stream.easy_bufferedreader_example;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args)  {


    }

    @Test
    public void readFile01() throws IOException{

        String path = "D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\iostream_file\\new.txt";
        FileReader fileReader = new FileReader(path);
        int c;

        while((c = fileReader.read()) != -1){
            System.out.print((char)c);
        }

        fileReader.close();
    }

    @Test
    public void readFile02() throws IOException{

        String path = "D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\iostream_file\\new.txt";
        FileReader fileReader = new FileReader(path);

        char[] buf = new char[16];
        int i;

        while((i = fileReader.read(buf)) != -1){
            for(int j = 0; j < i; j++){
                System.out.print(buf[j]);
            }
        }

        fileReader.close();
    }
}
