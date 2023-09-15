package lesson.thread_.thread_primary;

import static java.lang.Thread.sleep;

public class ThreadExample1 {
    public static void main(String[] args) {
        Thread_1 thread1 = new Thread_1();
        Thread_2 thread2 = new Thread_2();

        Thread thread_1 = new Thread(thread1);
        Thread thread_2 = new Thread(thread2);

        thread_1.start();
        thread_2.start();
    }
}

class Thread_1 implements Runnable{
    int count  =0;
    @Override
    public void run() {

        while(count != 30){
            System.out.println("hello world "  + ++count);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread_2 implements Runnable{
    int count  =0;
    @Override
    public void run() {

        while(count != 20){
            System.out.println("hi "  + ++count);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



















