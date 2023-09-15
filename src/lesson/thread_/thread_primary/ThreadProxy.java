package lesson.thread_.thread_primary;

public class ThreadProxy {
    public static void main(String[] args) {
        Dog dog = new Dog();

        System.out.println(Thread.currentThread().getName());

        ThreadProxy_ threadProxy = new ThreadProxy_(dog);

        threadProxy.start();
    }
}

class ThreadProxy_ implements Runnable{

    private Runnable target = null;

    @Override
    public void run() {
        target.run();
    }

    public ThreadProxy_(Runnable temp) {
        this.target = temp;
    }

    public void start() {
        start0();
    }

    public void start0(){
        run();
    }
}
