package lesson.iostream_.processing_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        properties.setProperty("user","申建松");
        properties.setProperty("charset","utf8");
        properties.setProperty("password","102030405");

        properties.store(new FileOutputStream("src/lesson.iostream_/mysql_1.properties"),"用户信息如下");

        System.out.println("配置成功");
    }
}
