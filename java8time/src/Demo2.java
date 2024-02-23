import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo2 {
    public static void main(String[] args) {
        /*
        static Instant now() 获取当前时间的Instant对象（标准时间）
        static Instatn ofXxxx(long epochMilli)根据秒，毫秒，纳秒获取instant对象
        ZonedDateTime atZone(ZoneId zone)   指定时区
        boolean isXxx(Instant otherInstant)  判断系列的方法
        Instant minusXxx(long millisToSbtract)  减少时间系列的方法
        Instant plusXxx(long millistoSubtract)  增加时间系列的方法
         */
        Instant i1 = Instant.now();
        System.out.println(i1);

        Instant i2 = Instant.ofEpochMilli(0L);
        System.out.println(i2);
        Instant i3 = Instant.ofEpochSecond(1L);
        System.out.println(i3);

        ZonedDateTime z = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(z);

        boolean b = i2.isBefore(i3);
        System.out.println(b);

        Instant i4 = i3.minusSeconds(1L);
        System.out.println(i4);
    }
}
