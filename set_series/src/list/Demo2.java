package list;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        /*
        所有的单列集合和数组才能使用增强for进行遍历
        修改增强for中第三方变量，不会改变集合原本的内容
         */
        ArrayList<String> a = new ArrayList<>();
        a.add("aaa");
        a.add("bbb");
        a.add("ccc");
        for (String str : a) {
            System.out.println(str);
        }

        a.forEach(System.out::println);
        a.forEach(s -> {
            System.out.println(s);
        });
    }
}
