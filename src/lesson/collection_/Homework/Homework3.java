package lesson.collection_.Homework;

import java.util.HashMap;
import java.util.Map;

public class Homework3 {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("jack", 650);
        map.put("tom", 1200);
        map.put("smith", 5050);

        map.put("jack",2600);

        map.keySet();

        for(Object obj : map.keySet()){
            map.put(obj,(int)map.get(obj)+100);
        }

        for(Object obj : map.keySet()){
            System.out.println(obj);
        }
        for(Object obj : map.keySet()){
            System.out.println(map.get(obj));
        }
    }
}


