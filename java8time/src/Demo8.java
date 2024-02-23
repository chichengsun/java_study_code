import java.time.LocalDate;
import java.time.Period;

public class Demo8 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalDate ld2 = LocalDate.of(2001, 6, 20);
        System.out.println(ld2);
        Period p = Period.between(ld2, ld);
        System.out.println(p);
        System.out.println(p.getYears());
        System.out.println(p.getMonths());
        System.out.println(p.getDays());
        System.out.println(p.toTotalMonths());
    }
}
