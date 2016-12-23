package chapters19;

/**
 * @author by kissx on 2016/11/24.
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());   //将一任务依附于某线程
        t.start();
        for (int i = 0; i < 1000; ++i)
            System.out.println("Waiting for LiftOff!");
    }
}
