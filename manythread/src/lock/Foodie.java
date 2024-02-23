package lock;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{
    ArrayBlockingQueue<String> q;
    public Foodie(ArrayBlockingQueue<String> q) {
        this.q = q;
    }
    @Override
    public void run() {
        while (true) {
            String take = null;
            try {
                take = q.take();
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName() + "吃货吃了" + take);
        }
    }
}
