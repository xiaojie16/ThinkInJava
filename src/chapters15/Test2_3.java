package chapters15;

/**
 * 为什么泛型参数不能直接初始化
 *
 * @author by kissx on 2016/10/3.
 */
public class Test2_3<T> {
    /*
    private T[] array = new T[3];   //Type parameter 'T' cannot be instantiated directly 为什么！！！
                                    //这里是因为擦除的缘故

    public Test2_3(T t1,T t2,T t3){
        array[0] = t1;
        array[1] = t2;
        array[2] = t3;
    }

    public T getT1(){
        return array[0];
    }
    public T getT2(){
        return array[1];
    }
    public T getT3(){
        return array[2];
    }



    public static void main(String[] args){

    }

    //*/
}
