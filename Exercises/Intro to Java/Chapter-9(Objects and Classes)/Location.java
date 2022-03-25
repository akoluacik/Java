import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Location {
    public int row, column;
    public double maxValue;

    public static Location locateLargest(double[][] a) {
        Location lc = new Location();
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
        Location loc = locateLargest(arr);
        System.out.println("The location of the largest element is " + loc.maxValue + " at (" + loc.row + " ," + loc.column + ")");

    }
}
