package lesson.thread_.thread_primary;

public class ThreadExercise {
    public static void main(String[] args) throws InterruptedException {
        ThreadExercise_TestThread threadExercise_testThread = new ThreadExercise_TestThread();
        Thread thread_thread_exercise = new Thread(threadExercise_testThread);


        for(int i = 1; i <+ 10; i++){
            System.out.println("hi " + i);
            Thread.sleep(1000);
            if(i == 5){
                thread_thread_exercise.start();
                thread_thread_exercise.join();
            }
        }

        System.out.println(Thread.currentThread().getName() + " ending---");
    }
}

class ThreadExercise_TestThread implements Runnable{
    @Override
    public void run() {
        for(int i =1 ; i <= 10; i++){
            System.out.println("Hello " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("warning!");
            }
        }
        System.out.println(Thread.currentThread().getName() + " ending---");
    }
}