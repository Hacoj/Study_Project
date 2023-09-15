package lesson.collection_.map_;

import java.util.*;

public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("Shen","Chen");
        map.put("Wan","Jia");
        map.put("1","一");
        map.put("2","二");
        map.put("3","三");
        map.put(null,"空");
        map.put("4",null);

        System.out.println(" map is " + map);
        System.out.println("");

        Set keySet_ = map.keySet();

        for(Object obj : keySet_){
            System.out.println(obj + "->" + map.get(obj));
        }

        System.out.println("");

        Iterator iterator1 = keySet_.iterator();
        while (iterator1.hasNext()) {
            Object key = iterator1.next();
            System.out.println(key + "->" + map.get(key));
        }
        System.out.println("");

        Collection values = map.values();

        for(Object obj : values){
            System.out.println(obj);
        }
        System.out.println("");

        Iterator iterator2 = values.iterator();
        while(iterator2.hasNext()){
            Object obj = iterator2.next();
            System.out.println(obj);
        }
        System.out.println("");

        Set entrySet_ = map.entrySet();
        for(Object obj : entrySet_){
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        System.out.println("");

        Iterator iterator3 = entrySet_.iterator();
        while (iterator3.hasNext()) {
            Object entry = iterator3.next();
            Map.Entry entry_ = (Map.Entry)entry;
            System.out.println(entry_.getKey() + "->" + entry_.getValue());
        }


    }
}