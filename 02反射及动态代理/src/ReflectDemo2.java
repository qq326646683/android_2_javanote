import test2.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Person> personClass = (Class<Person>) Class.forName("test2.Person");

        System.out.println("获取全部");
        Constructor<Person>[] constructor = (Constructor<Person>[]) personClass.getConstructors();
        for (Constructor<Person> personConstructor : constructor) {
            System.out.println(personConstructor);
        }

        Constructor<Person> constructor1 = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor1);
        Person nell = constructor1.newInstance("nell", 18);
        System.out.println(nell.getName());

        System.out.println("获取类方法");
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        System.out.println("获取所有方法");
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        System.out.println("获取指定方法");
        Method setName = personClass.getDeclaredMethod("setName", String.class);
        System.out.println(setName);

    }
}
