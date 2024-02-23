import java.util.Calendar;
import java.util.Date;

public class Demo3_Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date d = new Date(0L);
        System.out.println(d);
        c.setTime(d);
        System.out.println(c);
        c.set(Calendar.YEAR, 2024);
        c.set(Calendar.MONTH, 1);
        c.set(Calendar.DATE, 25);
        c.add(Calendar.MONTH, 1);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + " " + month + " " + date + " " + week);
        // 1星期天 2星期一 3星期二 4星期三 5星期四 6星期五 7星期六
    }
}
