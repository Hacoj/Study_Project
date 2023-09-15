package lesson.generic;

public class CustomMethodGenericExercise {
    public static void main(String[] args) {
        Apple<Banana, Student, String> apple = new Apple<>();
        apple.fly(new Student("shen", 10));
        apple.func(new Banana());
    }
}

class Apple<A, B, C>{
    public <E> void fly(E e){
        System.out.println(e.getClass().getSimpleName());
    }

    public void func(A a)
    {
        System.out.println(a.getClass().getSimpleName());
    }
}

class Banana{

}






















