import java.util.Locale;
import java.util.Scanner;

public class GeometrySameLine {
    public static void main(String[] args) {
        double[][] points = new double[5][2];
        fillPoints(points);
    }

    public static void fillPoints(double[][] arr) {
        Scanner kb = new Scanner(System.in);
        kb.useLocale(Locale.US);
        System.out.print("Ente five points: ");
        
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = kb.nextDouble();
            arr[i][1] = kb.nextDouble();
        }

        tangent(arr);
        /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }*/
    }

    public static void tangent(double[][] arr) {
        double prev_tg = (arr[1][1] - arr[0][1]) / (arr[1][0] - arr[0][0]);
        for (int i = 1; i < arr.length - 1; i++) {
            if(prev_tg != ((arr[i+1][1] - arr[i][1]) / (arr[i+1][0] - arr[i][0]))) {
                System.out.println("The five points are not on the same line");
                return;
            }
        }
        System.out.println("The points are on the same line");
    }
    
}
