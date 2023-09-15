package lesson.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * Author: Jiansong Shen
 * Version: 1.0
 */
public class ClassMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        String classPath = "lesson.reflection.Cat";
        //获取Cat的Class对象
        //<?> 表示不确定的Class类型
        //?表示通配符，表示全部的
        Class<?> cls = Class.forName(classPath);

        //输出Class
        System.out.println(cls);
        System.out.println(cls.getPackage().getName());
        System.out.println(cls.getName());

        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        hi.invoke(o);

        System.out.println(o);

        Field name = cls.getField("name");
        System.out.println(name.get(o));

        name.set(o, "邢潇彤");
        System.out.println(name.get(o));
    }
}