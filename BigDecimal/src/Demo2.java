import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo2 {
    public static void main(String[] args) {
        /*
        public BigDecimal add(BigDecimal val)  加法
        public BigDecimal subtract(BigDecimal val)  减法
        public BigDecimal multiply(BigDecimal val)  乘法
        public BigDecimal divide(BigDecimal val)  除法
        public BigDecimal divide(BigDecimal val, 精确几位, 舍入模式)  除法
         */
        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(3.0);

        System.out.println(bd1.divide(bd2, 2, RoundingMode.HALF_UP));
        // RoundingMode是一个枚举，具体的更多的参数参考文档
    }
}
