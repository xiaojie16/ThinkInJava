package chapters19;

import java.util.concurrent.*;

/**
 * @author by kissx on 2016/12/25.
 */
public class DaemonFromFactory implements Runnable{

    @Override
    public void run() {
        try{
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + ": " + this);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("我是 Finally 但是并没有什么卵用！");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool(new DaemonFactory());   //其接受 ThreadFactory 用于新建线程时调用
        for (int i = 0; i < 5; i++) {
            service.execute(new DaemonFromFactory());
        }
        System.out.println("后台线程建立完毕！");
        TimeUnit.MILLISECONDS.sleep(10005);
    }

}

class DaemonFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setDaemon(true);
        return thread;
    }
}
