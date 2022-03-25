import java.util.Scanner;

/**
 * NineHeadsandTails
 */
public class NineHeadsandTails {

    public static void main(String[] args) {
        int number;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number between 0-511: ");
        number = keyboard.nextInt();
        if(number < 0 || number > 511) {
            do {
                System.out.print("Please enter a number between 0 - 511:");
                number = keyboard.nextInt();
            } while (number > 511);
        }
        fillTable(number);
        //System.out.println(binary(number));
    }

    public static int binary( int number ) {
        int binary = 0, power = 0;
        while (number > 0) {
            //binary = binary * 10 + number % 2;
            binary = (int) (binary + Math.pow(10, power++) * (number % 2));
            number /= 2;
        }
        return binary;
    }

    public static void fillTable(int number) {
        int[][] arr = new int[3][3];
        int binNumber = binary(number);
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr.length - 1; j >= 0; j--) {
                arr[i][j] = binNumber % 10;
                binNumber /= 10;
            }
        }
        display(arr);
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                char c = (arr[i][j] == 0) ? 'H' : 'T';
                System.out.print(c);
            }
            System.out.println();
        }
    }
}