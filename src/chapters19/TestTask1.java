package chapters19;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author by kissx on 2016/12/8.
 */
public class TestTask1 implements Runnable {

    private Random random = new Random();

    @Override
    public void run() {
        int sleepTime = random.nextInt(10) + 1;
        try {
            TimeUnit.SECONDS.sleep(sleepTime);
            System.out.println("睡眠时间为：" + sleepTime);       //TODO 注意：这里睡眠的时候去调度其他子线程了，所以最后的输出结果会是显示的睡眠时间越来越大且对于同一睡眠时间几乎同时输出
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; ++i) {
            executorService.execute(new TestTask1());
        }
        executorService.shutdown();
    }

}
