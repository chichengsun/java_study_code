import java.util.List;
import java.util.Map;
import java.util.Set;

public class NoChangeSet {
    public static void main(String[] args) {
        List<String> list1 = List.of("a", "b", "c");
        System.out.println(list1);

        Set<Integer> list2 = Set.of(1, 2, 3);
        System.out.println(list2);

        Map<Integer, String> list3 = Map.of(1, "a", 2, "b", 3, "c");
        System.out.println(list3);
    }
}
