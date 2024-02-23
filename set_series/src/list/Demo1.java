package list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("aaa");
        a.add("bbb");
        a.add("ccc");

        Iterator<String> i = a.iterator();
        while (i.hasNext()) {
            String str = i.next();
            System.out.println(str);
        }

        ListIterator<String> it = a.listIterator();
        while (it.hasNext()) {
            String str = it.next();
            if (str.equals("bbb")) {
                it.add("qqq");
            }
            System.out.println(str);
        }
        System.out.println(it.hasPrevious());
        String str = it.previous();
        System.out.println(str);

        for (String s : a) {
            System.out.println(s);
        }
    }
}
