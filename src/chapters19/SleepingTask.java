package chapters19;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author by kissx on 2016/12/8.
 */
public class SleepingTask extends LiftOff {

    @Override
    public void run() {
        while (cuntDown-- > 0) {
            System.out.println(status());
            try {
                TimeUnit.MILLISECONDS.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; ++i) {
            exec.execute(new SleepingTask());
        }
        exec.shutdown();

    }
}
