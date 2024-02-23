import java.math.BigInteger;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        Random r = new Random();
        BigInteger b1 = new BigInteger(4, r);
        System.out.println(b1);

        BigInteger b2 = new BigInteger("100");
        System.out.println(b2);

        System.out.println(new BigInteger("100", 10));
        System.out.println(new BigInteger("100", 2));

        System.out.println(BigInteger.valueOf(100));
    }
}
