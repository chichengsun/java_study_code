package map;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Demo2 {
    public static void main(String[] args) {
        /*
        三种遍历方式
         */
        Map<String, String> map = new HashMap<>();
        map.put("aaa", "AAA");
        map.put("bbb", "BBB");
        map.put("ccc", "CCC");

        Set<String> strings = map.keySet();
        for (String s : strings) {
            System.out.println("key: " + s);
            System.out.println("value: " + map.get(s));
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
        }

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println("key: " + key);
                System.out.println("value: " + value);
            }
        });

        map.forEach((key, value) -> {
            System.out.println("key: " + key);
            System.out.println("value: " + value);
        });
    }
}
