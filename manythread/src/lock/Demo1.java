package lock;

public class Demo1 {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();
        MyThread mt4 = new MyThread();
        MyThread mt5 = new MyThread();
        MyThread mt6 = new MyThread();
        MyThread mt7 = new MyThread();
        MyThread mt8 = new MyThread();
        mt1.setName("window 1");
        mt2.setName("window 2");
        mt3.setName("window 4");
        mt4.setName("window 4");
        mt5.setName("window 5");
        mt6.setName("window 6");
        mt7.setName("window 7");
        mt8.setName("window 8");
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
        mt5.start();
        mt6.start();
        mt7.start();
        mt8.start();
    }
}
