package lesson.warpper_.date;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Date_ {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date);
        //                                                               此处的yyyy，MM不可替换，表示指定的年，月，等
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年，MM月，dd日，E， hh:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd日 E hh:mm:ss");
        String format1 = simpleDateFormat1.format(date);
        System.out.println(format1);

        String s = "2023年，08月，05日，周六， 05:43:38";
        String s1 = "2023年，08月，05日，周六， 05:43:38";
        //Date parse = simpleDateFormat1.parse(s);
        //Date parse1 = simpleDateFormat1.parse(s1);
        //System.out.println(simpleDateFormat.format(s));

    }
}
