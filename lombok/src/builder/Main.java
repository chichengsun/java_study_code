package builder;

public class Main {
    public static void main(String[] args) {
        /*
        @Builder
            查看out目录下的Student.class可知
            创建了一个名为builder的函数函数
                可通过链式方法创建一个对象
         */
        Student s = new Student("ss", 18);
        System.out.println(s);
        Student s2 = Student.builder().name("zz").age(18).build();
        System.out.println(s2);
    }
}
