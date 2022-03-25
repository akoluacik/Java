import java.util.Locale;
import java.util.Scanner;

public class Point {
    private double x1, y1, x2, y2;
    
    public Point(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        kb.useLocale(Locale.US);
        double[][] arr = new double[4][2];
        System.out.print("Enter four points: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = kb.nextDouble();
            }
            
        }

        Point p1 = new Point(arr[0][0], arr[0][1], arr[1][0], arr[1][1]);
        Point p2 = new Point(arr[2][0], arr[2][1], arr[3][0], arr[3][1]);

        double a = p1.y1 - p1.y2;
        double b = -1 * (p1.x1 - p1.x2);
        double c = p2.y1 - p2.y2;
        double d = -1 * (p2.x1 - p2.x2);
        double e = (p1.y1 - p1.y2) * p1.x1 - (p1.x1 - p1.x2) * p1.y1;
        double f = (p2.y1 - p2.y2) * p2.x1 - (p2.x1 - p2.x2) * p2.y2;
        
        Algebra algebra = new Algebra(a, b, c, d, e, f);
        System.out.println(algebra.isSolvable());
        System.out.println("Intersection point is: (" + algebra.getX() + "," + algebra.getY() + ")");


    }

}
/**
 * (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 * (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
		p[0] = points[0][1] - points[1][1];
		p[1] = -1 * (points[0][0] - points[1][0]);
		p[2] = points[2][1] - points[3][1];
		p[3] = -1 * (points[2][0] - points[3][0]);
		p[4] = (points[0][1] - points[1][1]) * points[0][0] - 
					  (points[0][0] - points[1][0]) * points[0][1];
		p[5] = (points[2][1] - points[3][1]) * points[2][0] - 
					  (points[2][0] - points[3][0]) * points[2][1];
		return p;
	}
}*/