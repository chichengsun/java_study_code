import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Demo5 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);

        LocalDate ld2 = LocalDate.of(2024, 1, 25);
        System.out.println(ld2);

        int year = ld1.getYear();
        System.out.println(year);

        Month month = ld1.getMonth();
        System.out.println(month);
        System.out.println(month.getValue());
        int m = ld1.getMonthValue();
        System.out.println(m);

        int day = ld1.getDayOfMonth();
        System.out.println(day);
        int day2 = ld1.getDayOfYear();
        System.out.println(day2);

        DayOfWeek week = ld1.getDayOfWeek();
        System.out.println(week);
        System.out.println(week.getValue());
    }
}
