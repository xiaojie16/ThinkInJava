package chapters19;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author by kissx on 2016/11/24.
 */

class TaskWithResult implements Callable<String> {

    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "TaskWithResult id: " + id;
    }
}

public class CallableDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<String>> results = new ArrayList<>();
        for (int i = 0; i < 5; ++i) {
            results.add(executorService.submit(new TaskWithResult(i)));
        }
        try {
            for (Future<String> result : results) {
                System.out.println(result.get());   //如果没有结果 get() 会被阻塞
//                if (result.isDone())      //判断一个 future 对应的线程是否结束
//                    System.out.println(result.get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
            return;
        } finally {
            executorService.shutdown();
        }
    }

}
