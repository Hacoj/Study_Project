package lesson.collection_.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collections_ {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Java");
        list.add("JavaScript");
        list.add("Go");
        list.add("Python");
        list.add("Php");
        System.out.println(list);

        System.out.println("===========================");
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("===========================");
        Collections.shuffle(list);
        System.out.println(list);

        System.out.println("===========================");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("===========================");
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2){
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println(list);

        System.out.println("===========================");
        Collections.swap(list,0,1);
        System.out.println(list);

        System.out.println("===========================");
        System.out.println(Collections.max(list));

        System.out.println("===========================");
        System.out.println(Collections.max(list, new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        return ((String) o1).length() - ((String) o2).length();
                    }
                }
        ));

        System.out.println("===========================");
        System.out.println(Collections.frequency(list,"Java"));

        System.out.println("===========================");
        ArrayList list1 = new ArrayList();
        for(int i = 0; i < list.size(); i++){
            list1.add(i);
        }
        Collections.copy(list1, list);
        System.out.println(list1);

        System.out.println("===========================");
        Collections.replaceAll(list,"Java","java");
    }
}
