import java.util.Locale;
import java.util.Scanner;

public class Q7_11 {
    public static void main(String[] args) {
        System.out.print("Enter ten numbers: ");
        double[] x = new double[10];
        Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.US);
        for (int i = 0; i < 10; i++) {
            x[i] = keyboard.nextDouble();
        }
        
        System.out.printf("%s%.2f\n%s%.4f\n","The mean is ", mean(x), "The standard devation is ", deviation(x));
        /*System.out.println("The mean is " + mean(x));
        System.out.println("The standard deviation is " + deviation(x));*/
    }

    /** Deviation computation */
    public static double deviation( double[] x ) {
        double deviation, sum = 0;
        double mean = mean(x);

        for (int i = 0; i < x.length; i++) {
            sum += Math.pow((x[i] - mean), 2);
        }

        deviation = Math.sqrt( sum / ( x.length - 1 ) );
        return deviation;
    }

    /** Mean computation */
    public static double mean( double[] x ) {
        double sum = 0;
        
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        
        return sum / 10;
    }

}
