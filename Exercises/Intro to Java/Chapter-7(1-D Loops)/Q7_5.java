import java.util.Scanner;

public class Q7_5 {
    public static void main(String[] args) {
        Q7_5Handler();   
    }

    public static void Q7_5Handler() { // driver method
        int[] numbers = new int[10];
        int len = ArrayCreator(numbers);
        System.out.println("The number of distinct number is " + len);
        System.out.print("The distinct numbers are: ");   
        for (int i = 0; i < len; i++) {
            System.out.print(numbers[i] + " ");   
        }
    }

    public static int ArrayCreator( int[] numbers ) {
        int number, idx = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input ten numbers: ");
        for (int i = 0; i < 10; i++) {
            //numbers[i] = keyboard.nextInt();
            number = keyboard.nextInt();
            if( ( !isPresent(numbers, number)) ) {
                numbers[idx++] = number;
            }
        }
        
        return idx;
    }

    public static boolean isPresent(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if( key == numbers[i] ) return true;
        }
        return false;
    }
}
