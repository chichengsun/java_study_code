import java.util.ArrayList;
import java.util.Collections;

public class Demo3 {
    public static void main(String[] args) {
        /*
        引用成员方法
        格式：对象::成员方法
        1. 其他类：其他类对象::方法名
        2. 本类：this::方法名
        3. 父类：super::方法名
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aerg", "dfb", "cf");
        list.stream().filter(new Demo3()::stringJudge).forEach(System.out::println);
    }

    public boolean stringJudge(String s) {
        return s.length() == 3;
    }
}
