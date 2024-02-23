public class Demo1 {
    public static void main(String[] args) {
        String string1 = "nihao";
        char[] chs = {'a', 'b', 'c', 'd'};
        String string2 = new String(chs);
        byte[] bys = {97, 98, 99, 100};
        String string3 = new String(bys);
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);

        System.out.println(string1.equals(string2));
        System.out.println(string2.equals(string3));
    }
}
