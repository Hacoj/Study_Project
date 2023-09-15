package lesson.warpper_.warpper;

public class Integer01 {
    public static void main(String[] args) {
        //jdk5以前手动装箱，拆箱
        int num1 = 100;
        //手动装箱
        //Integer integer1 = new Integer(num1);
        Integer integer1 = Integer.valueOf(num1);

        //手动拆箱
        int i = integer1.intValue();

        //自动装箱
        int num2 = 10;
        Integer integer2 = num2;
        //自动拆箱
        int num3 = integer2;
    }
}
