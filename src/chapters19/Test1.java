package chapters19;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author by kissx on 2016/12/8.
 */
public class Test1 {
    private volatile int inc = 0;

    public void increase() {
        inc++;
    }

    public static void main(String[] args) {
        /*
        final Test1 test1 = new Test1();
        for(int i = 0;i < 10;++i){
            new Thread(){
                @Override
                public void run() {
                    for(int j = 0;j < 10;++j)
                        test1.increase();
                    System.out.println("A执行！！！");
                }
            }.start();
            System.out.println("执行！！！");
        }
        //*/
//          while (Thread.activeCount() > 1)
//            Thread.yield();

        Test1 test1 = new Test1();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; ++i) {
            executorService.execute(new Thread() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; ++i)
                        test1.increase();
                    System.out.println("执行！！！");
                }
            });
        }
        executorService.shutdown();

        while (Thread.activeCount() > 1) {
        }
        System.out.println("inc: " + test1.inc);
    }

}
