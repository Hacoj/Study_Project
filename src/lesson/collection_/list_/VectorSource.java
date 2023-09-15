package lesson.collection_.list_;

import java.util.Vector;

public class VectorSource {
    public static void main(String[] args) {
        Vector vector = new Vector();
        //Vector vector = new Vector(8);

        for(int i = 0; i < 15; i++){
            vector.add(i);
        }
    }
}
