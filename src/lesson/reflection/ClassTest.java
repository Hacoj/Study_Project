package lesson.reflection;

import org.junit.jupiter.api.Test;

import javax.crypto.spec.PSource;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * Author: Jiansong Shen
 * Version: 1.0
 */
public class ClassTest {

    String path = "lesson.reflection.Cat";
    public static void main(String[] args) {

    }

    @Test
    public void Test_() throws ClassNotFoundException {
        Class<?> cls = Class.forName(path);

        System.out.println("cls->package\t" + cls.getPackage());
        System.out.println();

        System.out.println("cls->simple name\t" + cls.getSimpleName());
        System.out.println();

        System.out.println("cls->name\t" + cls.getName());
        System.out.println();

        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println("cls->fields\t" + field);
        }
        System.out.println();

        Field[] declaredFields = cls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("cls->declaredFields\t" + declaredField);
        }
        System.out.println();

        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println("cls->method\t" + method);
        }
        System.out.println();

        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("cls->declaredMethod->\t" + declaredMethod);
        }
        System.out.println();

        Constructor<?>[] constructors = cls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("cls->constructor\t" + constructor);
        }
        System.out.println();

        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("cls->declaredConstructors\t" + declaredConstructor);
        }
        System.out.println();

        Class<?> superclass = cls.getSuperclass();
        System.out.println("cls->superclass\t" + superclass);
        System.out.println();

        Class<?>[] interfaces = cls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("cls->interface\t" + anInterface);
        }
        System.out.println();


        Annotation[] annotations = cls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("cls->annotations\t" + annotation);
        }
        System.out.println();

    }
}
