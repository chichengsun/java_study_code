package test1;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("ss");
        s1.setAge(18);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());

        Student s2 = new Student("ll", 22);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
    }
}
