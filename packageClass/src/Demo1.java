public class Demo1 {
    public static void main(String[] args) {
        Integer i1 = 123;
        Integer i2 = Integer.valueOf("123");
        Integer i3 = Integer.valueOf(String.valueOf(123), 8);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        String str1 = Integer.toBinaryString(i1);
        System.out.println(str1);
        String str2 = Integer.toOctalString(i1);
        System.out.println(str2);
        String str3 = Integer.toHexString(i1);
        System.out.println(str3);

        int parseInt = Integer.parseInt("23");
        System.out.println(parseInt);
        //8中包装类中，除了Character都有对应的parseXxx()方法用来类型转换
    }
}
