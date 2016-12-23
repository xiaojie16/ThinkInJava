package chapters15;

/**
 * CRG 古怪的循环泛型
 * 基类用导出类替代其参数
 *
 * @author by kissx on 2016/10/18.
 */
public class Subtype extends BasicHolder<Subtype> {
    public static void main(String[] args) {
        Subtype subtype1 = new Subtype(), subtype2 = new Subtype();
        subtype1.set(new Subtype());
        Subtype subtype3 = subtype1.get();
        subtype3.set(subtype1);
        subtype3.f();
    }
}
