import java.sql.SQLOutput;
import java.time.LocalTime;

public class Demo6 {
    public static void main(String[] args) {
        LocalTime lt1 = LocalTime.now();
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.of(22, 20, 30);
        System.out.println(lt2);

        int hour = lt1.getHour();
        System.out.println(hour);

        int minute = lt1.getMinute();
        System.out.println(minute);

        int second = lt1.getSecond();
        System.out.println(second);

        int nano = lt1.getNano();
        System.out.println(nano);

    }
}
