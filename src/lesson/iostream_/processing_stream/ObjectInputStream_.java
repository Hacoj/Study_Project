package lesson.iostream_.processing_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String path = "D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\iostream_file\\Object_.sc";

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));

        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readBoolean());
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readByte());
        System.out.println(objectInputStream.readDouble());
        System.out.println(objectInputStream.readUTF());
        //System.out.println(objectInputStream.readObject());

        Object obj = objectInputStream.readObject();
        Dog dog = (Dog)obj;

        System.out.println(dog.getAge());
        System.out.println(dog.getName());

        objectInputStream.close();
    }
}
