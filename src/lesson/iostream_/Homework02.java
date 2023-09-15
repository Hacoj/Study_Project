package lesson.iostream_;

import java.io.*;

public class Homework02 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Project\\IDEA_Project\\Study_Project\\src\\lesson.iostream_\\Homework02.java";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(path));
        BufferedReader bufferedReader1 = new BufferedReader(inputStreamReader);//用于实现不同编码的文件

        String line;
        int lineNum = 0;
        while((line = bufferedReader.readLine()) != null){
            System.out.print(++lineNum + " ");
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
