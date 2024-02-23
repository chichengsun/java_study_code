package synchronize.demo1;

public class MyThread extends Thread{

    static int ticket = 0;
//    // 锁对象，一定是唯一的
//    static final Object obj = new Object();
    @Override
    public void run() {
        //同步代码块
        while (true) {
            synchronized (MyThread.class) {
                if (ticket < 100) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket ++;
                    System.out.println(getName() + " " + "Seiling " + ticket);
                }else {
                    break;
                }
            }
        }

    }
}
