public class Demo1 {
    public static void main(String[] args) {
//        System.exit(0);
//        System.out.println("看看我执行了吗？");
        System.out.println(System.currentTimeMillis());
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = new int[10];
        System.arraycopy(a, 0, b, 0, 10);
        for (int j : a) {
            System.out.println(j);
        }
        for (int j : b) {
            System.out.println(j);
        }
    }
}
