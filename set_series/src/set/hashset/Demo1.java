package set.hashset;


import java.util.HashSet;

public class Demo1 {
    public static void main(String[] args) {
        /*
        哈希值：
            对象的整数表现形式
            1. 如果没有重写hashCode方法，不同对象计算出的哈希值是不同的
            2. 如果已经重写hashCode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
            3. 但是在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样
         */
        Student s1 = new Student("lisi", 28);
        Student s2 = new Student("lisi", 28);
        Student s3 = new Student("ss", 28);
        Student s4 = new Student("zjj", 18);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        HashSet<Student> hs = new HashSet<>();
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));
        System.out.println(hs);

    }
}
