package map.treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "ss");
        map.put(2, "zjj");
        map.put(5, "cy");
        map.put(4, "gg");
        map.put(3, "qy");
        System.out.println(map);

        TreeMap<Integer, String> map2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        map2.put(1, "ss");
        map2.put(2, "zgj");
        map2.put(5, "cy");
        map2.put(4, "gg");
        map2.put(3, "qy");
        System.out.println(map2);
    }
}
