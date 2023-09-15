package lesson.iostream_;

import java.io.File;
import java.io.IOException;

public class Homework01 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\iostream_file\\homework1.txt";
        String dirPath = "D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\iostream_file\\directory";

        File file = new File(path);

        if(file.exists()){
            System.out.println("it exists");
        }else{
            file.createNewFile();
        }

        File file1 = new File(dirPath);

        file1.mkdir();

    }
}
