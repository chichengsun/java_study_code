public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println(sb.length());
        System.out.println(sb.capacity()); //  2 * capacity + 2

        StringBuilder sb2 = new StringBuilder();
        sb2.append("abcdefghijklmnopqrstuvwxyz0123456789");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
    }
}
