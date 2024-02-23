package interclass.demo2;

public class Outer {
    static class Inter {
        public void show1() {
            System.out.println("非静态方法！");
        }

        public static void show2() {
            System.out.println("静态方法！");
        }
    }
}
