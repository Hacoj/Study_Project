package lesson.generic;

public class Generic03 {
    public static void main(String[] args) {
        Person<String> string = new Person<>("String");
        System.out.println();
    }

}

class Person<E>{
    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public Person(E e) {
        this.e = e;
    }

    private E e;
}
