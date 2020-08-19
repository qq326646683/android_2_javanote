import test2.Person;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<Person> personClass = (Class<Person>) Class.forName("test2.Person");
        Field[] fields = personClass.getDeclaredFields();
        System.out.println("获取所有属性:");
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("获取指定属性");
        Field field = personClass.getDeclaredField("name");
        System.out.println(field.getName());

        System.out.println("获取属性的值");
        Person nell = new Person("nell", 18);
        Object obj = field.get(nell);
        System.out.println(field.getName() + obj);

        System.out.println("设置属性值");
        field.set(nell, "nell2");
        System.out.println(nell.getName());

        System.out.println("获取私有属性");
        Field ageFieId = personClass.getDeclaredField("age");
        ageFieId.setAccessible(true);
        System.out.println(ageFieId.get(nell));

    }
}
