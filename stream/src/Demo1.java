import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aba", "abe", "ge", "tw4t");
        list.stream().filter(s -> s.matches("a.*")).forEach(System.out::println);

        list.stream().limit(3).forEach(System.out::println);

        list.stream().skip(1).limit(2).forEach(System.out::println);

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "a", "b", "c", "d", "b", "c");
        list2.stream().distinct().forEach(System.out::println);

        Stream.concat(list.stream(), list2.stream()).forEach(System.out::println);

        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "a-1", "b-2", "c-3", "d-4");
        list3.stream().map(s -> {
            String[] arr = s.split("-");
            return Integer.parseInt(arr[1]);
        }).forEach(System.out::println);
    }
}
