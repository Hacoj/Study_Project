package lesson.thread_.thread_primary;

public class ThreadMethod01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        myThread.setName("ShenChen");
        myThread.setPriority(Thread.MAX_PRIORITY);

        myThread.start();

        for(int i = 0; i < 5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            myThread.interrupt();
        }

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        while (true) {
            for(int i = 0; i < 100; i++){
                System.out.println(Thread.currentThread().getName() + " working---" + i);
            }

            try {
                System.out.println(Thread.currentThread().getName() + " sleeping---");
                sleep(20000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted---");

                e.printStackTrace();
            }
        }
    }
}