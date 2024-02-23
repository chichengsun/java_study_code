package map;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        /*
        V put(K key, V value)  添加元素
        V remove(Object key)  根据键删除键值对元素
        void clear()  移除所有的键值对元素
        boolean containsKey(Object key)  判断集合是否包含指定的键
        boolean containsValue(Object value)  判断集合是否包含指定的值
        boolean isEmpty()  判断集合是否为空
        int size()  集合的长度，也就是集合中键值对的个数
         */
        Map<String, String> map = new HashMap<>();

        // 在添加数据时，如果键不存在，那么直接把键值对添加到map集合中，方法返回null
        // 如果键已经存在，那么新的值会替换原有的值，方法返回原有的值
        String str = map.put("aaa", "AAA");
        System.out.println(str);
        map.put("bbb", "BBB");
        str = map.put("bbb", "BbB");
        System.out.println(str);
        System.out.println(map);

        str = map.remove("aaa");
        System.out.println(str);
        System.out.println(map);

        System.out.println(map.containsKey("aaa"));
        System.out.println(map.containsKey("bbb"));

        System.out.println(map.isEmpty());

        System.out.println(map.size());
    }
}
