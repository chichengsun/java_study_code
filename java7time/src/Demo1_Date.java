import java.util.Date;

public class Demo1_Date {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        Date d2 = new Date(1000L);
        System.out.println(d2);

        d2.setTime(2000L);
        System.out.println(d2);

        long time = d2.getTime();
        System.out.println(time);
    }
}
