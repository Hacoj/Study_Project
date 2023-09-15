package lesson.thread_.synchronize;

public class DeadLock {
    public static void main(String[] args) {
        TestDeadLockClass testDeadLockClass1 = new TestDeadLockClass(1);
        TestDeadLockClass testDeadLockClass2 = new TestDeadLockClass(0);



        testDeadLockClass1.start();
        testDeadLockClass2.start();
    }
}

class TestDeadLockClass extends Thread{
    public TestDeadLockClass(int i) {
        this.i = i;
    }

    private int i = 1;

    private static Object o1 = new Object();
    private static Object o2 = new Object();
    @Override
    public void run() {
        if(i == 1){
            synchronized (o1){
                System.out.println("enter o1 , i == 1");
                synchronized (o2){
                    System.out.println("enter o2, i == 1");
                }
            }
        }else{
            synchronized (o2){
                System.out.println("enter o2 , i != 1");
                synchronized (o1){
                    System.out.println("enter o1, i != 1");
                }
            }
        }

    }
}