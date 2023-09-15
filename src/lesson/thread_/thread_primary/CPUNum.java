package lesson.thread_.thread_primary;

public class CPUNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        int num = runtime.availableProcessors();

        System.out.println(num);
    }
}
