package lesson.collection_.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("shenchen");
        list.add("Shenchen");
        list.add("ShenChen");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.print(next);

        }
        System.out.println(" ");

        for(Object obj : list) {
            System.out.print(obj);
        }
        System.out.println(" ");

        for(int i =0 ;i < list.size();i++){
            Object obj= list.get(i);
            System.out.print(obj);
        }
    }
}
