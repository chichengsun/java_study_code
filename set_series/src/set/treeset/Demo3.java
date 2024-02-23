package set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo3 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int sub = o1.length() - o2.length();
                sub = sub == 0 ? o1.compareTo(o2) : sub;
                return sub;
            }
        });
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");
        ts.add("abcd");
        // 首先按照长度排序，如果长度一样，则按照字母排序
        System.out.println(ts);
    }
}
