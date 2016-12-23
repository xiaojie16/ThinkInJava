package chapters14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author by kissx on 2016/9/25.
 */

public class SimpleDynamicProxy {

    public static void consumer(IImage consume) {
        consume.displayImage();
    }

    public static void main(String[] args) {
        IImageDisplay real = new IImageDisplay();
        consumer(real);
        IImage proxy = (IImage) Proxy.newProxyInstance(
                IImage.class.getClassLoader(),      //类加载器
                new Class[]{IImage.class},          //接口列表
                new DynamicProxyHandler(real)       //动态代理类构造方法
        );
        consumer(real);
    }
}

class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    //此方法最关键
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() + ",method: " + method + ",args: " + args);
        if (args != null) {
            for (Object arg : args)
                System.out.println(arg);
        }
        return method.invoke(proxied, args);  //返回值为 Object 是代理实例方法的调用返回值
    }
}