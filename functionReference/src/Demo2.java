import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class Demo2 {
    public static void main(String[] args) {
        /*
        引用静态方法
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4");
        list.stream().map(Integer::parseInt).forEach(System.out::println);
    }
}
