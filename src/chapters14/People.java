package chapters14;

import chapters14.util.NULL;

/**
 * @author by kissx on 2016/9/26.
 */
public class People {

    private String last;
    private String first;
    private String address;

    public People(String last, String first, String address) {
        this.last = last;
        this.first = first;
        this.address = address;
    }

    @Override
    public String toString() {
        return "People: " + first + " " + last + " " + address;
    }

    //public static class NullPeople extends People{    //虽然这里的NULL接口没有什么实质的作用，但是其可以表明一个类具有相应的属性，如该类具有空对象这个能力
    public static class NullPeople extends People implements NULL {
        private NullPeople() {
            super("None", "None", "None");
        }

        @Override
        public String toString() {
            return "NULLPeople";
        }
    }

    public final static People NULL = new NullPeople(); //保证NULL为单例的
}
