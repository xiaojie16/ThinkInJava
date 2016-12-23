package chapters19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author by kissx on 2016/11/24.
 */
public class FixedThreadPool {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);  //如果申请的线程池的大小小于添加的，则当某一线程完成后才再向里面添加
        for (int i = 0; i < 6; ++i) {
            service.execute(new LiftOff());
        }
        service.shutdown();
//        service.shutdownNow();  //这就能体现上述的话了，而且也体现了 shutdownNow() 的区别
    }

}
