package chapters15;

import java.sql.Time;
import java.util.Date;

/**
 * 装饰器模式
 *
 * @author by kissx on 2016/10/20.
 */

class Basic {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class Decorator extends Basic {
    protected Basic basic;

    public Decorator(Basic basic) {
        this.basic = basic;
    }

    @Override
    public void setValue(String value) {
        super.setValue(value);
    }

    @Override
    public String getValue() {
        return super.getValue();
    }
}

class TimeStamped extends Decorator {
    private final long timeStamp;

    public TimeStamped(Basic basic) {
        super(basic);
        timeStamp = new Date().getTime();
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}

class SerialNumbered extends Decorator {
    private static long counter = 1;
    private final long serialNumber = counter++;

    public SerialNumbered(Basic basic) {
        super(basic);
    }

    public long getSerialNumber() {
        return serialNumber;
    }
}

public class Decoration {

    public static void main(String[] args) {
        TimeStamped t1 = new TimeStamped(new Basic());
        TimeStamped t2 = new TimeStamped(new SerialNumbered(new Basic()));
//        t2.getSerialNumber();
//        很明显上面是不可视的方法，所有不能调用，这里就表现出了装饰器解决混型的局限性
    }
}
