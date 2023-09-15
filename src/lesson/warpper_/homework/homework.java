package lesson.warpper_.homework;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your name:");
        String name = scanner.next();

        while(name.length()> 4 | name.length() < 2)
        {
            System.out.println("Wrong!Please input again:");
            name = scanner.next();
        }

        System.out.println("Input your password:");
        String s = scanner.next();

        while(s.length() != 6) {
            System.out.println("Length wrong! Please input again:");
            s = scanner.next();
        }

        while(!checkNum(s)) {
            System.out.println("Wrong! Your password must be number, please input again:");
            s = scanner.next();
        }

        System.out.println("Input your email:");
        String email = scanner.next();

        int index1 = email.indexOf('@');
        int index2 = email.indexOf('.');

        while(index1 > index2 || index1 < 1){
            System.out.println("Format wrong! Please input again:");
            email = scanner.next();
            index1 = email.indexOf('@');
            index2 = email.indexOf('.');
        }

        System.out.println("success");

    }
    public static boolean checkNum(String s) {
        char[] temp = s.toCharArray();
        for(int i =0 ;i < temp.length; i++){
            if (temp[i] > '9' || temp[i] <'0') {
                return false;
            }
        }
        return true;
    }
}
