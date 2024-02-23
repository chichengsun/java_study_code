package map.treemap;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Demo3 {
    public static void main(String[] args) {
        String str = "aababcabcdabcdeabdcedbcebadbceabdcdddcbeeeebba";
        System.out.println(str.length());
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character chr = str.charAt(i);
            if (map.containsKey(chr)) {
                map.put(chr, map.get(chr) + 1);
            }else {
                map.put(chr, 1);
            }
        }
        System.out.println(map);
        StringBuilder sb = new StringBuilder();
        map.forEach((character, integer) -> sb.append(character).append("(").append(integer).append(")").append(" "));
        System.out.println(sb);
    }
}
