package lesson.collection_.set_;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetSource {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();

        set.add(123);
        set.add(124);
        set.add(125);
        set.add(123);
        set.add("sjs");

    }
}
