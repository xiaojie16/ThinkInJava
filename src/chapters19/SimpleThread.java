package chapters19;

/**
 * @author  by kissx on 2016/12/25.
 */
public class SimpleThread extends Thread{

    private int countDown = 5;
    private static int threadCount;

    public SimpleThread() {
        super(Integer.toString(++threadCount));
        start();
    }

    @Override
    public String toString() {
        return "#" + getName() + "(" + countDown + ")";
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(this);
            if (--countDown == 0)
                return;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            new SimpleThread();
            System.out.println("我先来！");
        }
    }
}
