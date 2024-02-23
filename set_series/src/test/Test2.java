package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        /*
        班级里面有N个学生
        70%的概率选到男生
        30%的概率选到女生
         */
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0);
        Random r = new Random();
        int index = r.nextInt(list.size());
        int number = list.get(index);
        System.out.println(number);

        ArrayList<String> listBoy = new ArrayList<>();
        ArrayList<String> listGirl = new ArrayList<>();
        Collections.addAll(listBoy, "a", "b", "c", "d", "e", "f", "g");
        Collections.addAll(listGirl, "h", "i", "j", "k", "l", "m", "n");
        if (number == 1) {
            Collections.shuffle(listBoy);
            System.out.println(listBoy.get(0));
        }else {
            Collections.shuffle(listGirl);
            System.out.println(listGirl.get(0));
        }
        System.out.println(list);
    }
}
