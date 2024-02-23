package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
        ArrayList<String> temp = new ArrayList<>();
        int size = list.size();

        for (int j = 0; j < 5; j++) {
            System.out.println("====" + (j + 1) + "====");
            for (int i = 0; i < size; i++) {
                Random r = new Random();
                int index = r.nextInt(list.size());
                String str = list.remove(index);
                System.out.println(str);
                temp.add(str);
            }
            list.addAll(temp);
            temp.clear();
            System.out.println("====" + (j + 1) + "====");
        }
    }
}
