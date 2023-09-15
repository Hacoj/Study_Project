package lesson.iostream_.processing_stream.easy_bufferedreader_example;

public class BufferedReader_ extends Reader_{
    public Reader_ reader_;

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    public void readFiles(int num){
        for(int i = 0; i < num; i++){
            reader_.readFile();
        }
    }

    public void readStrings(int num){
        for(int i = 0; i < num; i++){
            reader_.readString();
        }
    }
}
