package chapters19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author by kissx on 2016/11/24.
 */
public class CachedThreadPool {

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; ++i) {
            service.execute(new LiftOff());
        }
//        service.shutdown();     //防止新任务被提交给这个 Executor ，但会运行完之前提交的所有任务
//        service.shutdownNow();     //企图关闭正在执行的任务，这个更加狠
//         ExecutorService的生命周期包括三种状态：运行、关闭、终止。创建后便进入运行状态，当调用了shutdown（）方法时，便进入关闭状态，此时意味着ExecutorService不再接受新的任务，但它还在执行已经提交了的任务，当素有已经提交了的任务执行完后，便到达终止状态。如果不调用shutdown（）方法，ExecutorService会一直处在运行状态，不断接收新的任务，执行新的任务，服务器端一般不需要关闭它，保持一直运行即可

    }

}
