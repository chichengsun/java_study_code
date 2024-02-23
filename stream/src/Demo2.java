import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3);

        long count = list.stream().count();
        System.out.println(count);

        Object[] array = list.stream().toArray();
        System.out.println(Arrays.toString(array));
        Integer[] integers = list.stream().toArray(value -> new Integer[value]);
        System.out.println(Arrays.toString(integers));

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "a-1", "b-2", "c-3");

        List<String> collect = list2.stream().collect(Collectors.toList());
        System.out.println(collect);

        Set<String> collectSet = list2.stream().collect(Collectors.toSet());
        System.out.println(collectSet);

        Map<String, Integer> collectMap = list2.stream()
                .collect(Collectors
                        .toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[1])));
        System.out.println(collectMap);
    }
}
