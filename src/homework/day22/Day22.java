package homework.day22;

class Worker extends Thread {
//    static boolean isStop = false;
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("작업 스레드 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
//        isStop = true;
    }
}

public class Day22 {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Worker();
        worker.start();
        int alphabet = (int) 'a';
        while (true) {
            System.out.println("메인 스레드 : " + (char) alphabet++);
            Thread.sleep(500);
            if (!worker.isAlive()) {
                break;
            }
        }
    }
}
