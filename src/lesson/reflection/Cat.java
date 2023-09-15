package lesson.reflection;

/*
 * Author: Jiansong Shen
 * Version: 1.0
 */
public class Cat extends Animal implements Interface1, Interface2{

    //名称
    public String name = "小白";
    //年龄
    private int age = 4;
    public void hi(){
        System.out.println("hi~meow~meow~");
    }

    public void cry(){
        System.out.println("QAQ");
    }

    public Cat() {
    }

    public Cat(String name, int age) {
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

class Animal{
    private int age;
    private int name;
    private int split;

    public Animal() {
    }

    public Animal(int name) {
        this.name = name;
    }

    public Animal(int age, int name, int split) {
        this.age = age;
        this.name = name;
        this.split = split;
    }
}

interface Interface1{}

interface Interface2{}