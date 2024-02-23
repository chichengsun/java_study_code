import java.time.Duration;
import java.time.LocalDateTime;

public class Demo9 {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1);
        LocalDateTime ldt2 = LocalDateTime.of(2001, 6, 20, 0, 0, 0);
        System.out.println(ldt2);

        Duration d = Duration.between(ldt2, ldt1);
        System.out.println(d);
        System.out.println(d.toDays());
        System.out.println(d.toHours());
        System.out.println(d.toMinutes());
        System.out.println(d.toSeconds());
    }
}
