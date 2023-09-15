package lesson.thread_.thread_primary;

public class DaemonThread_ {
    public static void main(String[] args) {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();

        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(1000);
                System.out.println("Main is working...");
            } catch (InterruptedException e) {
                System.out.println("Main is stopped.....");
            }
        }
    }
}

class MyDaemonThread extends Thread{
    @Override
    public void run() {
        while(true){
            try {
                System.out.println("MyDaemonThread is working---");
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("STOPPED");
            }
        }

    }
}


