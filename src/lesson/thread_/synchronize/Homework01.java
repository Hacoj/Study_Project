package lesson.thread_.synchronize;

public class Homework01 {
    public static void main(String[] args) {
        SellTicket sellTicket = new SellTicket();

        new Thread(sellTicket).start();
        new Thread(sellTicket).start();
        new Thread(sellTicket).start();
        new Thread(sellTicket).start();


    }
}

class SellTicket implements Runnable{
    private int money = 10000;

    @Override
    public void run() {
        while(true){
            synchronized (this) {
                if(money < 1000){
                    System.out.println("no money, balance is " + money);
                    return;
                }

                money-=1000;
                System.out.println("withdraw 1000");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}