import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student(12, "ss");
        Student s2 = new Student(18, "zjj");
        Student s3 = new Student(22, "zgj");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);
    }
}
