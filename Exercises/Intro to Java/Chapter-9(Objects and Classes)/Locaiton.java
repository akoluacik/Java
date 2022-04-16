/**
 * Question 9.13
 * Q9.13
 * (The Location class) Design a class named Location for locating a maximal 
 * value and its location in a two-dimensional array. The class contains public data 
 * fields row, column, and maxValue that store the maximal value and its indices 
 * in a two-dimensional array with row and column as int types and maxValue as 
 * a double type.
 * Write the following method that returns the location of the largest element in a 
 * two-dimensional array:
 * public static Location locateLargest(double[][] a)
 * The return value is an instance of Location. Write a test program that prompts 
 * the user to enter a two-dimensional array and displays the location of the largest 
 * element in the array. Here is a sample run:
 */
import java.util.Locale;
import java.util.Scanner;

public class Locaiton {
    public int row, column;
    public double maxValue;

    public static Locaiton locateLargest(double[][] a) {
        Locaiton lc = new Locaiton();
        lc.maxValue = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(lc.maxValue < a[i][j]) {
                    lc.maxValue = a[i][j];
                    lc.row = i;
                    lc.column = j;
                }
            }
        }

        return lc;
    }

    public static double[][] createArray(int row, int col) {
        Scanner kb = new Scanner(System.in);
        kb.useLocale(Locale.US);
        double[][] arr = new double[row][col];
        System.out.println("Enter the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = kb.nextDouble();
            }
        }
        //kb.close();
        return arr;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n, m;
        System.out.print("Enter the number of rows and columns in the array: ");
        n = kb.nextInt();
        m = kb.nextInt();
        //kb.close();
        double[][] arr = createArray(n, m);
        Locaiton loc = locateLargest(arr);
        System.out.println("The location of the largest element is " + loc.maxValue + " at (" + loc.row + " ," + loc.column + ")");

    }
}
