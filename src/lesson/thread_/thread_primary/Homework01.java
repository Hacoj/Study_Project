package lesson.thread_.thread_primary;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Homework01 {
    public static void main(String[] args) {
        HomeworkThread1 homeworkThread1 = new HomeworkThread1(true);
        HomeworkDaemonClass homeworkDaemonClass = new HomeworkDaemonClass(homeworkThread1);


        homeworkThread1.start();
        homeworkDaemonClass.start();
    }
}

class HomeworkThread1 extends Thread{
    Random random = new Random();

    private boolean loop = true;

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    public HomeworkThread1(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while(loop){
            try {
                System.out.println(random.nextInt(101));
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class HomeworkDaemonClass extends Thread implements KeyListener{
    private HomeworkThread1 homeworkThread1;

    public HomeworkDaemonClass(HomeworkThread1 homeworkThread1) {
        this.homeworkThread1 = homeworkThread1;
    }

    @Override
    public void run() {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_Q){
            homeworkThread1.setLoop(false);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
