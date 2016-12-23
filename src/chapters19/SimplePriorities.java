package chapters19;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author by kissx on 2016/12/8.
 */
public class SimplePriorities implements Runnable{
    private int countDown = 5;
    private volatile double d;
    private int p;


    public SimplePriorities(int p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return Thread.currentThread() + ": " + countDown;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(p);
        while (true){
            for (int i = 0; i < 100000; i++) {
//                d+= (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0)
                    Thread.yield();
            }
            System.out.println(this);
            if (--countDown == 0)
                return;
        }
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++)
            service.execute(new SimplePriorities(Thread.MIN_PRIORITY));
        service.execute(new SimplePriorities(Thread.MAX_PRIORITY));
        service.shutdown();
    }

}
