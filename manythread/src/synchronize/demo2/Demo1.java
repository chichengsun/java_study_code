package synchronize.demo2;

public class Demo1 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);
        Thread t4 = new Thread(mr);
        Thread t5 = new Thread(mr);
        Thread t6 = new Thread(mr);
        Thread t7 = new Thread(mr);
        Thread t8 = new Thread(mr);
        t1.setName("window 1");
        t2.setName("window 2");
        t3.setName("window 3");
        t4.setName("window 4");
        t5.setName("window 5");
        t6.setName("window 6");
        t7.setName("window 7");
        t8.setName("window 8");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }
}
