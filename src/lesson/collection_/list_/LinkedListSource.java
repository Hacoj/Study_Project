package lesson.collection_.list_;

import java.util.LinkedList;

//CRUD ====》增删改查
public class LinkedListSource {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        //LinkedList linkedList = new LinkedList(10);

        for (int i = 0; i < 3; i++) {
            linkedList.add(i);
        }

        System.out.println(linkedList);

        linkedList.remove();

        System.out.println(linkedList);


    }
}
