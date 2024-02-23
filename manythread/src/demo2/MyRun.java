package demo2;

public class MyRun implements Runnable{

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(t.getName() + "Hello World!");
        }
    }
}
