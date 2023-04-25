package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class main {
    public static void main(String[] args) {
//        ReflectServiceImpl reflectService = getInstance();
//        reflectService.sayHi();
//        reflect();
//        testJdkProxy();
//        testCGLIBProxy();
//        testInterceptor();
        testChain();
    }

    public static ReflectServiceImpl getInstance() {
        ReflectServiceImpl object = null;
        try {
            Constructor<ReflectServiceImpl> constructor = ReflectServiceImpl.class.getConstructor(String.class);
            // 反射生成对象
            object = constructor.newInstance("张三");
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return object;
    }

    public static Object reflect() {
        ReflectServiceImpl object = null;
        try {
            Constructor<ReflectServiceImpl> constructor = ReflectServiceImpl.class.getConstructor(String.class);
            object = constructor.newInstance("张三");
            Method method = object.getClass().getMethod("location", String.class, String.class);
            method.invoke(object, "China", "Shanghai");
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return object;
    }

    public static void testJdkProxy() {
        JdkProxyExample jdk = new JdkProxyExample();
        // 绑定关系，声明代理对象
        HelloWorld proxy = (HelloWorld) jdk.bind(new HelloWorldImpl());
        proxy.sayHelloWorld();
    }

    public static void testCGLIBProxy() {
        CglibProxyExample cpe = new CglibProxyExample();
        ReflectServiceImpl proxy = (ReflectServiceImpl) cpe.getProxy(ReflectServiceImpl.class);
        proxy.sayHi();
    }

    public static void testInterceptor() {
        HelloWorld proxy = (HelloWorld) InterceptorJdkProxy.bind(
                new HelloWorldImpl(), "reflect.MyInterceptor");
        proxy.sayHelloWorld();
    }

    public static void testChain() {
        String packageName = "reflect.";
        HelloWorld proxy1 = (HelloWorld) InterceptorJdkProxy.bind(
                new HelloWorldImpl(), packageName + "Interceptor1"
        );
        HelloWorld proxy2 = (HelloWorld) InterceptorJdkProxy.bind(
                proxy1, packageName + "Interceptor2"
        );
        HelloWorld proxy3 = (HelloWorld) InterceptorJdkProxy.bind(
                proxy2, packageName + "Interceptor3"
        );
        proxy3.sayHelloWorld();
    }
}
