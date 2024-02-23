package synchronize.demo2;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 2, 5, 10, 50, 100, 500, 1000, 2000, 5000, 10000);
        MyThread mt1 = new MyThread(list);
        MyThread mt2 = new MyThread(list);
        mt1.setName("抽奖池1");
        mt2.setName("抽奖池2");
        mt1.start();
        mt2.start();
    }
}
