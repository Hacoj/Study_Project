package lesson.reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Properties;

/*
 * Author: Jiansong Shen
 * Version: 1.0
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Properties properties = new Properties();

        properties.load(new FileInputStream("src\\lesson\\reflection\\reflection.properties"));

        String classPath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();

        System.out.println("classfullpath = " + classPath);
        System.out.println("method = " + method);

        Class aClass = Class.forName(classPath);
        Object o = aClass.newInstance();

        System.out.println("o" + o.getClass());

        Method classMethod = aClass.getMethod(method);
        classMethod.invoke(o);
    }

}
