package lesson.iostream_.processing_stream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream = System.out;

        printStream.println("D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\iostream_file\\text.txt");

        System.setOut(new PrintStream("D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\iostream_file\\text.txt"));

        System.out.println("\n未来皆不可知");
    }
}
