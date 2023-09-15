package lesson.thread_.synchronize;

public class SynchronizeExample01 {
    public static void main(String[] args) {
        SellTicket01 sellTicket01_1 = new SellTicket01();

        new Thread(sellTicket01_1).start();
        new Thread(sellTicket01_1).start();
        new Thread(sellTicket01_1).start();
    }
}

class SellTicket01 extends Thread{

    private static int ticket_num = 100;

    private boolean loop = true;

    public synchronized void sell(){
        if(ticket_num <= 0){
            System.out.println("SOLD OUT~");
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
    @Override
    public void run() {
        while(loop){
            sell();
        }
    }
}