package synchronize.demo1;

public class Demo1 {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();
        mt1.setName("window 1");
        mt2.setName("window 2");
        mt3.setName("window 3");
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
