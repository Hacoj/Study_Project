package lesson.reflection;

/*
 * Author: Jiansong Shen
 * Version: 1.0
 */
public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
        // Class也是类，继承Object
        // Class由系统创建
        //Cat cat = new Cat();

        //反射
        Class<?> aClass1 = Class.forName("lesson.reflection.Cat");
        Class<?> aClass2 = Class.forName("lesson.reflection.Cat");

        System.out.println(aClass1.hashCode());
        System.out.println(aClass2.hashCode());
    }
}
