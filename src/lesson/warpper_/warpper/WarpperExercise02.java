package lesson.warpper_.warpper;

public class WarpperExercise02 {
    public static void main(String[] args) {
        Integer i =new Integer(1);
        Integer j = new Integer(1);
        System .out . println(i == j);//False

        //所以，这里主要是看范围-128 ~ 127 就是直接返回

        Integer m = 1;
        Integer n = 1;
        System . out . println(m == n); //T

        //所以，这里主要是看范围-128 ~ 127就是直接返回

        Integer x = 128;//Integer . valueOf(1);
        Integer y = 128;//iInteger . valueOf(1);
        System . out . println(x == y);//False
    }
}
