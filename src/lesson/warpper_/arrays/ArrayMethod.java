package lesson.warpper_.arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayMethod {
    public static void main(String[] args) {
        Integer[] arr = {1,2,56,89,123};
        Integer[] newArr = Arrays.copyOf(arr,arr.length);

        System.out.println(Arrays.toString(newArr));

        Arrays.fill(newArr, 9);
        System.out.println(Arrays.toString(newArr));

        List myList = Arrays.asList(1,2,4,6,7);
        System.out.println(myList.getClass());
    }
}
