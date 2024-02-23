package map.treemap;

import java.util.TreeMap;

public class Demo2 {
    public static void main(String[] args) {
        TreeMap<Student, String> map = new TreeMap<>();
        Student s1 =new Student("ss", 18);
        Student s2 = new Student("zjj", 18);
        Student s3 = new Student("cy", 22);
        Student s4 = new Student("zgj", 22);
        Student s5 = new Student("lqy", 25);
        map.put(s1, "wuhan");
        map.put(s2, "beijing");
        map.put(s3, "nanjing");
        map.put(s4, "haerbing");
        map.put(s5, "shanghai");
        System.out.println(map);
    }
}
