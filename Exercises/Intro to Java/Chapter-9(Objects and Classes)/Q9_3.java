import java.math.BigDecimal;
import java.util.Scanner;

public class Q9_3 {
    public static void main(String[] args) {
        
        int[] arr = new int[]{
            10000,
            100000,
            1000000,
            10000000,
            100000000,
            1000000000
        };
        
        Q9_3_myOwnDate myOwnDate;
        
        for (int i = 0; i < arr.length; i++) {
            myOwnDate = new Q9_3_myOwnDate(arr[i]);
            myOwnDate.displayDate();
        }
    }
}
