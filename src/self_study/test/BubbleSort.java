package self_study.test;

import java.util.Scanner;
import java.util.Vector;

/*
 * Author: Jiansong Shen
 * Version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {

        //初始化
        Vector<Double> objects = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        String string;


        //读取
        System.out.print("请输入");
        while (!(string = scanner.nextLine()).equals("quit")) {

            //分开
            String str[] = string.split(",");

            //存入vector
            for(int i = 0; i < str.length; i++){
                try {
                    objects.add(Double.parseDouble(str[i]));
                } catch (NumberFormatException e) {
                    System.out.println("你的输入  不对，有问题");
                    break;
                }
            }

            //排序
            for(int i = 0; i < objects.size() - 1; i++){
                for(int j = 0; j < objects.size() - i - 1;j++){
                    if(objects.get(j) > objects.get(j + 1)){
                        double temp = objects.get(j);
                        objects.set(j, objects.get(j + 1));
                        objects.set(j + 1, temp);
                    }
                }
            }

            //输出
            for (Double d:
                 objects) {
                System.out.print(d + "  ");
            }
            System.out.println();

            System.out.print("请输入");
        }
    }
}
