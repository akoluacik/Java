/**
 *  (Use the Date class) Write a program that creates a Date object, sets its elapsed 
 * time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
 * 10000000000, and 100000000000, and displays the date and time using the 
 * toString() method, respectively
 */

 /** ANSWER
  * See also Q9_3_myOwnDate.java file
  */


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
