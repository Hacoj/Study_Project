package lesson.iostream_.processing_stream.easy_bufferedreader_example;

public class Test_ {
    public static void main(String[] args) {
        StringReader_ stringReader = new StringReader_();
        BufferedReader_ bufferedReader = new BufferedReader_(stringReader);

        bufferedReader.readStrings(10);
    }
}
