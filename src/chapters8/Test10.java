package chapters8;

/**
 * @author by kissx on 2016/7/26.
 */
public class Test10 {
    public static void main(String[] args) {
        Instrument instrument = new Wind();
        instrument.first();
    }
}

class Instrument {
    public void first() {
        second();
    }

    public void second() {
        System.out.println("Instrument: 基类；");
    }
}

class Wind extends Instrument {
    public void second() {
        System.out.println("Wind:   子类；");
    }
}
