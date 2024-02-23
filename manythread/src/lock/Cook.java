package lock;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{
    ArrayBlockingQueue<String> q;
    public Cook(ArrayBlockingQueue<String> q) {
        this.q = q;
    }

    @Override
    public void run() {
        while (true) {
            try {
                q.put("面条");
                Thread.sleep(500L);
                System.out.println(getName() + "厨师做了一碗面条！");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
