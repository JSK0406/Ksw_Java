package homework.day22;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Day22 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("작업 스레드 : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            exec.shutdown();
        };
        exec.execute(task);
        int alphabet = (int) 'a';
        while (true) {
            System.out.println("메인 스레드 : " + (char) alphabet++);
            Thread.sleep(500);
            if (exec.isShutdown()) {
                break;
            }
        }
    }
}
