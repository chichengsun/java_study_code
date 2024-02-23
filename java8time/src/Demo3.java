import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo3 {
    public static void main(String[] args) {
        ZonedDateTime zt = ZonedDateTime.now();
        System.out.println(zt);

        ZonedDateTime time1 = ZonedDateTime.of(2024, 1, 1, 11,
                30, 49, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);

        Instant instant = Instant.ofEpochMilli(0L);
        ZoneId zoneid = ZoneId.of("Asia/Shanghai");
        ZonedDateTime time2 = ZonedDateTime.ofInstant(instant, zoneid);
        System.out.println(time2);
    }
}
