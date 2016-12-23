package chapters16;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by kissx on 2016/10/22.
 */
public class ArrayOfGenerics {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String>[] ls;
        List[] la = new List[10];
        ls = (List<String>[]) la;
        ls[0] = new ArrayList<String>();  //可以像里面添加 String 的
//        ls[1] = new ArrayList<Integer>(); //由于 ls 的定义束缚只能往里面添加 String 的或者，原生的

//        List<String>[] lss = {new ArrayList<>(),new ArrayList<>()};

        Object[] objs = ls;
        objs[1] = new ArrayList<Integer>();   //这里是协变类型，感觉 ls 数组本质上还是 List[],上面只是加了点束缚
        objs[2] = new Object();
    }
}
