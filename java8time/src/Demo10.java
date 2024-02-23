import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Demo10 {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1);
        LocalDateTime ldt2 = LocalDateTime.of(2001, 6, 20, 0, 0, 0);
        System.out.println(ldt2);

        System.out.println(ChronoUnit.YEARS.between(ldt2, ldt1));
        System.out.println(ChronoUnit.MONTHS.between(ldt2, ldt1));
        System.out.println(ChronoUnit.DAYS.between(ldt2, ldt1));
        System.out.println(ChronoUnit.WEEKS.between(ldt2, ldt1));
        System.out.println(ChronoUnit.HOURS.between(ldt2, ldt1));
        System.out.println(ChronoUnit.MINUTES.between(ldt2, ldt1));
        System.out.println(ChronoUnit.SECONDS.between(ldt2, ldt1));
        System.out.println(ChronoUnit.MILLIS.between(ldt2, ldt1));
        System.out.println(ChronoUnit.MICROS.between(ldt2, ldt1));
        System.out.println(ChronoUnit.NANOS.between(ldt2, ldt1));
    }
}
