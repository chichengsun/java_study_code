package set.treeset;

import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(3);
        ts.add(4);
        ts.add(1);
        ts.add(2);
        System.out.println(ts);
    }
}
