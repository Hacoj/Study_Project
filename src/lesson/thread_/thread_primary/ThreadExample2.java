package lesson.thread_.thread_primary;

import static java.lang.Thread.sleep;

public class ThreadExample2 {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();

        SellTicket02 sellTicket02 = new SellTicket02();

        Thread thread_1 = new Thread(sellTicket02);
        Thread thread_2 = new Thread(sellTicket02);
        Thread thread_3 = new Thread(sellTicket02);

        thread_1.start();
        thread_2.start();
        thread_3.start();

    }
}

class SellTicket01 extends Thread{

    private static int ticket_num = 100;
    @Override
    public void run() {
        while(true){
            if(ticket_num <= 0){
                break;
            }
            try {

                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName()
                    + "售出一张票，剩余票数：" + ticket_num--);
        }
    }
}

class SellTicket02 implements Runnable{

    private /*static*/ int ticket_num = 100;
    @Override
    public void run() {
        while(true){
            if(ticket_num <= 0){
                break;
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName()
                    + "售出一张票，剩余票数：" + ticket_num--);
        }
    }

}













