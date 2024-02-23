package set.treeset;

import java.util.TreeSet;

public class Demo2 {
    public static void main(String[] args) {
        Student s1 =new Student("ss", 18);
        Student s2 = new Student("zjj", 18);
        Student s3 = new Student("cy", 22);
        Student s4 = new Student("zgj", 23);
        Student s5 = new Student("lqy", 25);
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        System.out.println(ts);
        System.out.println(Student.count);

        System.out.println("bbb".compareTo("aaa"));
    }
}
