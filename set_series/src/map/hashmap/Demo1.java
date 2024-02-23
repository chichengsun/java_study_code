package map.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, 0);
        }
        for (String s : list) {
            map.put(s, map.get(s) + 1);
        }
        System.out.println(map);
    }
}
