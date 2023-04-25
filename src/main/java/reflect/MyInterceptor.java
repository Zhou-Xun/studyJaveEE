package reflect;

import javax.sound.midi.SysexMessage;
import java.lang.reflect.Method;

public class MyInterceptor implements Interceptor{

    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("反射方法前的逻辑");
        return false; // 不反射被代理方法
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("取代了被代理对象的方法");
    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("反射方法后的逻辑");
    }
}
