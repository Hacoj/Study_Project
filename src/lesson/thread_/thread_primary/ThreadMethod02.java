package lesson.thread_.thread_primary;

public class ThreadMethod02 {
    public static void main(String[] args) {
        MyThread_1 myThread_1 = new MyThread_1();
        myThread_1.start();

        for (int i = 1; i < 20; i++){
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " 主线程 "+i);

                if(i == 5){
                    System.out.println("==========WARNNING==========");
                    //myThread_1.join();
                    Thread.yield();
                    System.out.println("============================");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+ "子线程 " + i);
        }
    }
}

class MyThread_2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
