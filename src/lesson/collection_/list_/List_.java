package lesson.collection_.list_;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("s");
        list.add("j");
        list.add("s");
        System.out.println("list = " + list);

        List list1 = new ArrayList();
        list1.add("jack");
        list1.add("tom");
        list.addAll(1,list1);
        System.out.println("list = " + list);

        System.out.println(list.indexOf("tom"));
        System.out.println(list.lastIndexOf("s"));

        list.remove(0);
        System.out.println("list = " + list);

        list.set(2, "me");
        System.out.println("list = " + list);

        List sublist = list.subList(0,2);
        System.out.println("sublist = " + sublist);

    }
}
