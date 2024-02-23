import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo4 {
    public static void main(String[] args) {
        /*
        引用构造方法：
            格式：类名::new
            范例：Student::new
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a-1", "b-2", "c-3", "d-4");
        List<Student> collect = list.stream().map(s -> {
            String[] arr = s.split("-");
            return new Student(arr[0], Integer.parseInt(arr[1]));
        }).collect(Collectors.toList());
        System.out.println(collect);

        List<Student> collect1 = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
