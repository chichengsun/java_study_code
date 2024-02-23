import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "a", "b", "c");
        Stream<String> stream1 = list1.stream();
        stream1.forEach(System.out::println);

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "a");
        hm.put(2, "b");
        hm.put(3, "c");
        Set<Integer> integers = hm.keySet();
        Stream<Integer> stream2 = integers.stream();
        stream2.forEach(System.out::println);
        Set<Map.Entry<Integer, String>> entries = hm.entrySet();
        Stream<Map.Entry<Integer, String>> stream3 = entries.stream();
        stream3.forEach(System.out::println);
        
        int[] a = {1, 2, 3, 4, 5};
        
        IntStream stream4 = Arrays.stream(a);
        stream4.forEach(System.out::println);
        String[] b = {"a", "b", "c", "d"};
        Stream<String> stream5 = Arrays.stream(b);
        stream5.forEach(System.out::println);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        integerStream.forEach(System.out::println);
    }
}