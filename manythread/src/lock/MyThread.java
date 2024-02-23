package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{

    static int ticket = 0;
//    // 锁对象，一定是唯一的
//    static final Object obj = new Object();

    static Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (ticket == 100) {
                    break;
                }else {
                    ticket ++;
                    System.out.println(getName() + " " + "seiling " + ticket);
                }
            } finally {
                lock.unlock();
            }
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
