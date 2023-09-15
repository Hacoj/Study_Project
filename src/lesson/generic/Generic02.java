package lesson.generic;

import java.util.ArrayList;

public class Generic02 {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("旺财", 4));
        dogs.add(new Dog("小黑", 3));
        dogs.add(new Dog("大黄", 6));
        dogs.add(new Dog("发财", 4));

        for (Dog dog :
                dogs) {
            System.out.println(dog.getName() + dog.getAge());
        }
    }
}





























