package lesson.iostream_.node_stream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy_ {
    public static void main(String[] args) {


    }

    @Test
    public void fileCopy() throws IOException {
        String filePath1 = "D:\\Project\\IDEA_Project\\Tank_Fighting_v0.3\\out\\production\\Tank_Fighting_v0.3\\explode_1.png";
        String filePath2 = "D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\iostream_file\\pngg.png";

        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;

        fileInputStream = new FileInputStream(filePath1);
        fileOutputStream = new FileOutputStream(filePath2);

        byte[] buf = new byte[4096];
        int readlen = 0;
        while((readlen = fileInputStream.read(buf)) != -1){
            fileOutputStream.write(buf,0,buf.length);
        }

        System.out.println("拷贝完成");

        if(fileInputStream != null){
            fileOutputStream.close();
        }

        if(fileOutputStream != null){
            fileOutputStream.close();
        }
    }
}

