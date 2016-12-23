package chapters19;

import java.util.concurrent.TimeUnit;

/**
 * @author by kissx on 2016/12/25.
 */
public class SimpleDaemons implements Runnable{

    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(new SimpleDaemons());
            thread.setDaemon(true);
            thread.start();
        }

        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(275);

    }

}
