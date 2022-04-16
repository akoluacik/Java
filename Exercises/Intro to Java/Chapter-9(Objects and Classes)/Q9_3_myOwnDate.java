/**
 * Helper class for Q9.3
 */
import java.util.Date;
public class Q9_3_myOwnDate {
    private Date date;
    
    public Q9_3_myOwnDate(int elapsedTime) {
        date = new Date(elapsedTime);
    }
    
    public void displayDate() {
        System.out.println(date.toString());
    }
}
