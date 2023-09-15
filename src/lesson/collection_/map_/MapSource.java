package lesson.collection_.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSource {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("1", "Shen");
        map.put("2", "Chen");


        Set set = map.entrySet();

        for(Object obj : set){
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
