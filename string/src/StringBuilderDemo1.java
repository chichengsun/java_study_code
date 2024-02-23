public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aa");
        sb.append(true);
        sb.append(1);
        sb.append(1.2);
        sb.append('b');
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        String string = sb.toString();
        System.out.println(string);
    }
}
