package set.linkedhashset;
import java.util.LinkedHashSet;

public class Demo1 {
    public static void main(String[] args) {
        Student s1 = new Student("lisi", 28);
        Student s2 = new Student("lisi", 28);
        Student s3 = new Student("ss", 28);
        Student s4 = new Student("zjj", 18);
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));
        System.out.println(lhs);
    }
}
