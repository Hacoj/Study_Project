package lesson.iostream_.processing_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Properties01 {
    public static void main(String[] args) throws IOException {
        String path = "src/lesson.iostream_/mysql.properties";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        String line = null;

        while((line = bufferedReader.readLine()) != null){
            String[] split = line.split("=");

            System.out.println(split[0] + " is " + split[1]);
        }

        bufferedReader.close();
    }
}
