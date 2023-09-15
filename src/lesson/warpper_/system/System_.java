package lesson.warpper_.system;

import java.util.Arrays;

public class System_ {
    public static void main(String[] args) {
        //exit退出,exit（0）表示正常退出
        System.out.println("one");
        //System.exit(0);
        System.out.println("two");

        int[] src = {1,2,4};
        int[] dest = new int[3];

        System.arraycopy(src, 0 , dest, 0, 3);

        System.out.println(Arrays.toString(dest));
        System.out.println(Arrays.toString(src));

        System.out.println(System.currentTimeMillis());
    }

}
