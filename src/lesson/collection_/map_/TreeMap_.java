package lesson.collection_.map_;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_ {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });

        treeMap.put("i", 1);
        treeMap.put("he", 2);
        treeMap.put("she", 3);

        System.out.println(treeMap);
    }
}
