package lesson.warpper_.warpper;

public class Warpper_String {
    public static void main(String[] args) {
        Integer i = 100;
        //包装类转化为String
        //方式1
        String str1= i + "";
        //方式2
        String str2 = i.toString();
        //方式3
        String str3 = String.valueOf(i);

        //String转化为包装类
        String str4 = "1234";
        //方法1
        Integer i2 = Integer.parseInt(str4);
        //方法2
        Integer i3 = new Integer(str4);
    }
}
