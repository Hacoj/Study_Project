package lesson.thread_.synchronize;

public class SynchronizedTestExample1 {
    public static void main(String[] args) {
        TestSellTicket1 testSellTicket1 = new TestSellTicket1();

        new Thread(testSellTicket1).start();
        new Thread(testSellTicket1).start();
        new Thread(testSellTicket1).start();
        new Thread(testSellTicket1).start();
    }
}

class TestSellTicket1 extends Thread {
    private int ticket_num = 100;

    private boolean loop = true;

    Object object = new Object();

    @Override
    public void run() {
        //System.out.println("safd");
        while (loop) {

            synchronized (object) {
                if (ticket_num <= 0) {
                    System.out.println("SOLD OUT");
                    loop = false;
                    return;
                }


                try {
                    System.out.println("窗口" + Thread.currentThread().getName()
                            + "售出一张票，剩余票数：" + --ticket_num);
                    sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}
