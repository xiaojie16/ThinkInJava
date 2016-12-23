package chapters15;

/**
 * @author by kissx on 2016/10/15.
 */
public class SimpleHolder {
    private Object obj;

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public static void main(String[] args) {
        SimpleHolder simpleHolder = new SimpleHolder();
        simpleHolder.setObj("item");
        String str = (String) simpleHolder.getObj();
    }
}

