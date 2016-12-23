package chapters15;

/**
 * @author by kissx on 2016/10/4.
 */
public class Test<T> {
    private T t;

    public Test(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    /*
    //注意在 static 方法里面无法泛型类的类型参数，很显然，类型参数不能声明为静态的，所以不能
    //故，如果 static 方法需要使用泛型能力，就必须使其成为泛型方法
    public static  T needT(){
        return t;
    }
   //*/
}
