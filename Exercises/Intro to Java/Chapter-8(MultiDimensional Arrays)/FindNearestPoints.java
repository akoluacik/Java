import java.util.Locale;
import java.util.Scanner;

public class FindNearestPoints {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = keyboard.nextInt();
        
        double[][] points = new double[numberOfPoints][2];
        System.out.print("Enter " + numberOfPoints + " points: ");

        for (int i = 0; i < numberOfPoints; i++) {
            points[i][0] = keyboard.nextDouble();
            points[i][1] = keyboard.nextDouble();
        }

        int p1 = 0, p2 = 1;
        double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);
        double distance;

        for (int i = 1; i < numberOfPoints - 1; i++) {
            for (int j = i + 1; j < numberOfPoints; j++) {
                distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                
                if (distance < shortestDistance) {
                    shortestDistance = distance;
                    p1 = i;
                    p2 = j;
                }
            }
        }

        System.out.println("The closest points are (" + points[p1][0] + "," + points[p1][1] + ") and (" + points[p2][0] + "," + points[p2][1] + ")");
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        return distance;
    }
}
