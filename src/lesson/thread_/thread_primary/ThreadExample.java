package lesson.thread_.thread_primary;

import static java.lang.Thread.sleep;
import java.util.Scanner;

public class ThreadExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog_ dog1 = new Dog_();
        Thread dog_ = new Thread(dog1);

        System.out.println(Thread.currentThread().getName());

        int n = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        dog.start();
        dog_.start();
        for(int i = 1; i < 10; ++i){
            try {
                System.out.println(i);
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Dog extends Thread{
    @Override
    public void run() {
        super.run();
        int time = 1;
        System.out.println("主人~");

        while (time!=90) {
            System.out.println("第" + time + "次");

            System.out.println(Thread.currentThread().getName());

            try {
                time++;
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Dog_ implements Runnable{
    @Override
    public void run() {

        int time = 0;
        while (time!=9) {
            System.out.println("第" + time + "次");
            System.out.println(Thread.currentThread().getName());

            try {
                time++;
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}