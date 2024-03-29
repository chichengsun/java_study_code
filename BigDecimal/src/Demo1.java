import java.math.BigDecimal;

public class Demo1 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);
        System.out.println(bd1);
        System.out.println(bd2);

        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        System.out.println(bd3);
        System.out.println(bd4);

        BigDecimal bd5 = BigDecimal.valueOf(0.001);
        System.out.println(bd5);
    }
}
