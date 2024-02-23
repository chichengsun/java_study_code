import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2_SimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date(0L);
        System.out.println(d1);
        String string = sdf1.format(d1);
        System.out.println(string);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE");
        String string2 = sdf2.format(d1);
        System.out.println(string2);

        String str = "2023-11-11 11:11:11";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf3.parse(str);
        System.out.println(date);
    }
}
