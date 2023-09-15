package lesson.iostream_.node_stream;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        CreateFile createFile = new CreateFile();

        createFile.createfile1();
        createFile.createfile2();
    }

    @Test
    public void createfile1() throws IOException {
        String path1 = "D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\iostream_file\\new_1.txt";
        File file = new File(path1);

        file.createNewFile();
    }

    @Test
    public void createfile2() throws IOException {
        File filedir = new File(
                "D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\iostream_file\\");
        String filename = "new_2.txt";
        File file = new File(filedir, filename);

        file.createNewFile();
        System.out.println("create successfully");
    }

    @Test
    public void createfile3() throws IOException {
        File filedir = new File(
                "D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\iostream_file\\");

        String filename = "new_3.txt";
        File file = new File(filedir, filename);

        file.createNewFile();
        System.out.println("create successfully");
    }


}


