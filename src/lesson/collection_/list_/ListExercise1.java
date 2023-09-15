package lesson.collection_.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListExercise1 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();

        for(int i = 0; i < 10 ;i++) {
            list.add("hello " + i);
        }

        System.out.println("list = " + list);

        list.add(1, "ShenChen");
        System.out.println("list = " + list);

        System.out.println("第五个元素：" + list.get(4));
        list.remove(4);
        System.out.println("移除第5个元素后：" + list);

        list.set(7, "ShenChenDeWanJia");
        System.out.println("修改第八个元素后：" + list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.print(next);
        }

    }
}
