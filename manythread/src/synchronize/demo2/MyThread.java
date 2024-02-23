package synchronize.demo2;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread{

    ArrayList<Integer> list;
    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }
    @Override
    public void run() {
        ArrayList<Integer> box = new ArrayList<>();
        while (true) {
            synchronized (MyThread.class) {
                if (this.list.isEmpty()) {
                    System.out.println(getName() + box);
                    break;
                }else {
                    Collections.shuffle(this.list);
                    Integer remove = list.remove(0);
                    box.add(remove);
                }
            }
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
