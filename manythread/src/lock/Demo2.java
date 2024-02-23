package lock;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> q = new ArrayBlockingQueue<>(10);
        Cook c1 = new Cook(q);
        Cook c2 = new Cook(q);
        Cook c3 = new Cook(q);
        c1.setName("ss");
        c2.setName("zz");
        c3.setName("96");
        Foodie f1 = new Foodie(q);
        Foodie f2 = new Foodie(q);
        Foodie f3 = new Foodie(q);
        f1.setName("f1");
        f2.setName("f2");
        f3.setName("f3");
        c1.start();
        c2.start();
        c3.start();
        f1.start();
        f2.start();
        f3.start();
    }
}
