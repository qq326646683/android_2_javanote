package reflect;

import reflect.test.Servant;

public class ReflectDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Servant servant = new Servant();
        servant.ok("haha");

        Class servantClass1 = Servant.class;
        Class servantClass2 = Class.forName("reflect.test.Servant");
        Servant servant1 = (Servant) servantClass1.newInstance();
        servant1.ok("hehe");
    }
}
