package lesson.thread_.thread_primary;

import static java.lang.Thread.sleep;

public class ThreadExit {
    public static void main(String[] args) {
        T t = new T();
        t.start();

        try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.setLoop(false);
    }
}
class T extends Thread{

    int count = 0;

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    private boolean loop = true;

    @Override
    public void run() {

        while(loop){
            try {
                System.out.println(count++ +"-----");
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
