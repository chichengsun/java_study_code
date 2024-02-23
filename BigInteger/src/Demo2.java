import java.math.BigInteger;

public class Demo2 {
    public static void main(String[] args) {
        BigInteger bi1 = BigInteger.valueOf(100);
        BigInteger bi2 = BigInteger.valueOf(200);
        BigInteger bi3 = bi1.add(bi2);
        System.out.println(bi3);

        System.out.println(bi2.subtract(bi1));

        System.out.println(bi1.multiply(bi2));

        System.out.println(bi2.divide(bi1));
        BigInteger[] biArr = bi2.divideAndRemainder(bi1);
        System.out.println(biArr[0]);
        System.out.println(biArr[1]);

        System.out.println(bi1.equals(bi2));

        System.out.println(bi1.pow(2));

        System.out.println(bi1.max(bi2));

        System.out.println(bi1.intValue());
    }

}
