package lesson.iostream_.processing_stream.usage;

import java.io.*;

public class BufferedCopy_01 {
    public static void main(String[] args) throws IOException {

        String srcPath = "D:\\Project\\IDEA_Project\\Study_Project\\src\\lesson.iostream_\\processing_stream\\usage\\BufferedCopy_01.java";
        String destPath = "D:\\Project\\IDEA_Project\\Study_Project\\src\\lesson.iostream_\\processing_stream\\usage\\BufferedCopy_dest_01.java";

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        bufferedReader = new BufferedReader(new FileReader(srcPath));
        bufferedWriter = new BufferedWriter(new FileWriter(destPath,true));

        String line;
        while((line = bufferedReader.readLine()) != null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
    }
}
