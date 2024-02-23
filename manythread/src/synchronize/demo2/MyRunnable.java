package synchronize.demo2;

public class MyRunnable implements Runnable{
    int ticket = 0;

    @Override
    public void run() {
        while (true) {
            if (method()) {
                break;
            }
        }
    }

    private synchronized boolean method() {
        if (this.ticket == 100) {
            return true;
        }else {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket ++;
            System.out.println(Thread.currentThread().getName() + " " + "Seiling " + ticket);
        }
        return false;
    }
}
