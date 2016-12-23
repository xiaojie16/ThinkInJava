package chapters19;

import java.util.concurrent.TimeUnit;

/**
 * @author by kissx on 2016/12/25.
 * 如果一个线程为后台，则该线程创建的子线程仍未后台线程
 */
public class Daemons {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Daemon());
        thread.setDaemon(true);
        thread.start();
        System.out.println("Thread is Daemon : " + thread.isDaemon());
        TimeUnit.MILLISECONDS.sleep(100);
    }
}

class Daemon implements Runnable{
    private Thread[] threads = new Thread[10];

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new DaemonSpawn());
            threads[i].start();
            System.out.println("DaemonSpawn() " + i + " ,start");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Threads[" + i + "] is Daemon : " + threads[i].isDaemon());
        }
        while (true)
            Thread.yield();
    }
}

class DaemonSpawn implements Runnable{

    @Override
    public void run() {
        while (true)
            Thread.yield();
    }
}
