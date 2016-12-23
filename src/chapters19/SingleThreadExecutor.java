package chapters19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author by kissx on 2016/11/24.
 */
public class SingleThreadExecutor {

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; ++i)
            service.execute(new LiftOff());
//        service.shutdown();   //注意如果没有改语句会 子线程不会关闭！！！！
    }

}
