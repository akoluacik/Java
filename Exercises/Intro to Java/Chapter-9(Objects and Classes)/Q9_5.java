import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Q9_5 {
    
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar.get(GregorianCalendar.YEAR) + "/" + (1 + calendar.get(GregorianCalendar.MONTH)) + "/" + calendar.get(GregorianCalendar.DAY_OF_MONTH));
        calendar.setTimeInMillis(123456789765L);
        System.out.println(calendar.get(GregorianCalendar.YEAR) + "/" + (1 + calendar.get(GregorianCalendar.MONTH)) + "/" +calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
