import java.time.ZoneId;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        /*
        static Set<String> getAvailableZoneIds()
        static ZoneId systemDEfault()
        static ZoneId of(String zoneId)
         */
        Set<String> z1 = ZoneId.getAvailableZoneIds();
        System.out.println(z1.size());
        System.out.println(z1);

        ZoneId z2 = ZoneId.systemDefault();
        System.out.println(z2);

        ZoneId z3 = ZoneId.of("America/Marigot");
        System.out.println(z3);
    }
}
