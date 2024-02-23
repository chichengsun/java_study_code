import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Demo4 {
    public static void main(String[] args) {
        ZonedDateTime time1 = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEEE");
        String str = dtf.format(time1);
        System.out.println(str);
    }
}
