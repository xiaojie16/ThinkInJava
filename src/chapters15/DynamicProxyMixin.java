package chapters15;

import chapters15.util.TwoTuple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * 动态代理实现混型
 *
 * @author by kissx on 2016/10/20.
 */

class MixinProxy implements InvocationHandler {

    Map<String, Object> delegatesByMethod;   //用于确定某个方法所属于哪一个对象

    public MixinProxy(TwoTuple<Object, Class<T>>... pairs) {  //多个代理
        delegatesByMethod = new HashMap<>();
        for (TwoTuple<Object, Class<T>> pair : pairs) {
            for (Method method : pair.b.getMethods()) {
                String methodName = method.getName();
                if (!delegatesByMethod.containsKey(methodName))
                    delegatesByMethod.put(methodName, pair.a);
            }
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        Object delegate = delegatesByMethod.get(methodName);
        return method.invoke(delegate, args);    //根据对象，确定调用那一个方法
    }

    public static Object newInstance(TwoTuple... pairs) {
        Class[] interfaces = new Class[pairs.length];
        for (int i = 0; i < pairs.length; ++i) {
            interfaces[i] = (Class) pairs[i].b;
        }
        ClassLoader c1 = pairs[0].a.getClass().getClassLoader();    //类加载器
        return Proxy.newProxyInstance(c1, interfaces, new MixinProxy(pairs)); //返回一个对象但是其可以代理好几个组合起来的类（或接口）
    }
}

public class DynamicProxyMixin {
//    Object mixin = MixinProxy.newInstance();
//    测试略，因为没有相关的类和接口

}
