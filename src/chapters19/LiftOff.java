package chapters19;

/**
 * @author by kissx on 2016/11/24.
 */
public class LiftOff implements Runnable {

    protected int cuntDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.cuntDown = countDown;
    }

    public String status() {
        return "#" + id + " (" + (cuntDown > 0 ? cuntDown : "LiftOff!") + ")";
    }

    @Override
    public void run() {
        while (cuntDown-- > 0) {
            System.out.println(status());
            Thread.yield();
        }
    }
}
