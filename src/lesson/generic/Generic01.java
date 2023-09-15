package lesson.generic;

import java.util.ArrayList;

public class Generic01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add(new Dog("旺财", 4));
        arrayList.add(new Dog("小黑", 3));
        arrayList.add(new Dog("大黄", 6));
        arrayList.add(new Dog("发财", 4));

        for (Object obj : arrayList) {
            Dog dog_ = (Dog)obj;
            System.out.println(dog_.getName() + dog_.getAge());

        }
    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
