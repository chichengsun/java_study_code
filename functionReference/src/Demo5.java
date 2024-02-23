import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo5 {
    public static void main(String[] args) {
        /*
        使用类名引用非静态方法
        格式：类名::方法名
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        /*
        引用数组的构造方法
        格式：数据类型[]::new
         */
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 2, 3);
        Integer[] arr = list2.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));

        ArrayList<Student> list3 = new ArrayList<>();
        list3.add(new Student("zhang", 28));
        list3.add(new Student("san", 18));
        list3.add(new Student("zhao", 22));
        String[] array = list3.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }
}
