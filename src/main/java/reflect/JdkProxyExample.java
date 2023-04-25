package reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyExample implements InvocationHandler {
    // 真实对象
    private Object target = null;

    /**
     * 绑定代理对象和真实对象
     * @param target 真实对象
     * @return 代理对象
     */
    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(), // 类的加载器
                target.getClass().getInterfaces(), // 声明接口
                this);
    }

    /**
     * @param proxy 代理对象
     * @param method 当前调度方法
     * @param args 当前方法参数
     * @return 方法返回结果
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入代理逻辑方法");
        System.out.println("调度真实对象之前的服务");
        Object output = method.invoke(target, args);
        System.out.println("调度真实对象之后的服务");
        return output;
    }
}
