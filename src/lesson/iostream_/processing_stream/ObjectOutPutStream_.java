package lesson.iostream_.processing_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutPutStream_ {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\iostream_file\\Object_.sc";

        ObjectOutputStream os = null;

        os = new ObjectOutputStream(new FileOutputStream(path));

        os.writeInt(100);
        os.writeBoolean(true);
        os.writeChar('1');
        os.writeByte(3);
        os.writeDouble(12.3);
        os.writeUTF("申建松");
        os.writeObject(new Dog(10,"大豆"));

        if (os != null) {
            os.close();
        }

    }
}

