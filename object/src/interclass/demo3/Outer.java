package interclass.demo3;

public class Outer {
    int b = 28;
    public void show() {
        int a = 10;
        class Inner {
            String name;
            int age;
            public void method1() {
                System.out.println(a);
                System.out.println(b);
                System.out.println("局部类中method1方法！");
            }
            public static void method2() {
                System.out.println("局部类中method2静态方法！");
            }
        }
        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.method1();
        Inner.method2();
    }
}
