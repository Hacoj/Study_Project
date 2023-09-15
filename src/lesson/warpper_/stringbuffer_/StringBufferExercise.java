package lesson.warpper_.stringbuffer_;

import java.util.Scanner;

public class StringBufferExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        try {
            double i = Double.parseDouble(string);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        StringBuffer sb = new StringBuffer(string);

        int i = sb.lastIndexOf(".");
        sb = sb.insert(i - 3, ',');

        for (int j = sb.indexOf(",") - 3; j > 0; j-=3) {
            sb.insert(j, ',');
        }

        System.out.println(sb);
    }
}
