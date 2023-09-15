package lesson.iostream_;

import java.io.*;
import java.util.Objects;
import java.util.Properties;

public class Homework03 {
    public static void main(String[] args) throws IOException {
        String filePath1 = "D:\\Project\\IDEA_Project\\Study_Project\\src\\lesson.iostream_\\dog.properties";
        String filePath2 = "D:\\Project\\IDEA_Project\\Study_Project\\out\\production\\Study_Project\\lesson.iostream_\\dog.obj";

        Dog dog = new Dog(5,"大黄", "黄色");

        Properties properties;
        properties = new Properties();
        properties.setProperty("名称",dog.getName());
        properties.setProperty("年龄",String.valueOf(dog.getAge()));
        properties.setProperty("颜色",dog.getColor());

        properties.store(new FileOutputStream(filePath1,true),"狗的信息如下：");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath2));
        objectOutputStream.writeObject(dog);

        String name = properties.getProperty("名称");
        String color = properties.getProperty("颜色");
        int age = Integer.parseInt(properties.getProperty("年龄"));

        Dog dog1 = new Dog(age, name, color);

        System.out.println(dog1);

        properties.clear();
        objectOutputStream.close();

    }
}

class Dog implements Serializable {
    private int age;
    private String name;
    private String color;

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name) && Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, color);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }
}
