package map.hashmap;

import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();
        Student s1 = new Student("zhangsan", 22);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        hm.put(s1, "北京");
        hm.put(s2, "武汉");
        hm.put(s3, "南京");
        Set<Student> key = hm.keySet();
        for (Student s : key) {
            System.out.println("key: " + s);
            System.out.println("value: " + hm.get(s));
        }
    }
}
