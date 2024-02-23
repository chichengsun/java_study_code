import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("-");
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);
        System.out.println(sj.length());

        StringJoiner sj2 = new StringJoiner("---", "[", "]");
        sj2.add("aaa").add("bbb").add("ccc");
        System.out.println(sj2);
        System.out.println(sj.length());
    }
}
