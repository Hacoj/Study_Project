package lesson.generic;

import java.util.*;

public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        students.add(new Student("申鹤", 16));
        students.add(new Student("优菈", 16));
        students.add(new Student("夜兰", 16));

        HashMap<String, Student> hashMap = new HashMap<>();

        hashMap.put("申鹤",new Student("申鹤", 16));
        hashMap.put("优菈",new Student("优菈", 16));
        hashMap.put("夜兰",new Student("夜兰", 16));

        Set<Map.Entry<String, Student>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
    }
}

class Student{
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

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }
}
