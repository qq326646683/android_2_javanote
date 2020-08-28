package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class NellCompany implements InvocationHandler {
    /*真实对象*/
    private Object factory;

    public Object getFactory() {
        return factory;
    }

    public void setFactory(Object factory) {
        this.factory = factory;
    }

    /*通过Proxy获取动态代理对象*/
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(factory.getClass().getClassLoader(), factory.getClass().getInterfaces(), this);
    }

    /*通过动态代理对象方法进行增强*/
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doBefore();
        Object result = method.invoke(factory, args);
        doAfter();
        return result;
    }

    private void doBefore() {
        System.out.println("完美售前");
    }

    private void doAfter() {
        System.out.println("完美售后");
    }
}
