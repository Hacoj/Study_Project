package lesson.iostream_.processing_stream.usage;

import java.io.*;

public class BufferedCopy_02 {
    public static void main(String[] args) throws IOException {

        String srcPath = "D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\iostream_file\\pngg.png";
        String destPath = "D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\iostream_file\\pngg1.png";

        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        bufferedInputStream = new BufferedInputStream(new FileInputStream(srcPath));
        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destPath));

        byte[] buf = new byte[1024];

        int readLen = 0;

        while((readLen = bufferedInputStream.read(buf)) != -1){
            bufferedOutputStream.write(buf,0,readLen);
        }

        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
































