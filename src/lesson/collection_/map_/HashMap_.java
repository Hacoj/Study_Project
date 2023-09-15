package lesson.collection_.map_;

import java.util.HashMap;

public class HashMap_ {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for(int i = 0; i < 13; i++){
            hashMap.put(new A(i),"Shen");
        }
    }
}

class A{
    public int num;

    @Override
    public String toString() {
        return "\n A{" +
                "num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return num == a.num;
    }

    @Override
    public int hashCode() {
        return 100;
    }

    public A(int num) {
        this.num = num;
    }
}
