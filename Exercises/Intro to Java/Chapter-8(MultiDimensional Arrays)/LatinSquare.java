import java.util.Scanner;

/**
 * **8.36 (Latin square) A Latin square is an n-by-n array filled with n different Latin lettters, 
 * each occurring exactly once in each row and once in each column. Write a 
 * program that prompts the user to enter the number n and the array of characters, 
 * as shown in the sample output, and checks if the input array is a Latin square. 
 * The characters are the first n characters starting from A
 *
 * Enter number n: 4
 * Enter 4 rows of letters separated by spaces: 
 * A B C D
 * B A D C
 * C D B A
 * D C A B
 * The input array is a Latin square
 * 
 * Enter number n: 3
 * Enter 3 rows of letters separated by spaces: 
 * A F D
 * Wrong input: the letters must be from A to C
 */

public class LatinSquare {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter number n:");
        int n = kb.nextInt();
        char[][] arr = new char[n][n];
        System.out.println("Enter 4 rows of letters:");
        for (int i = 0; i < n; i++) {
            String data = "";
            if(kb.hasNext()) {
                data = kb.next();
            } else {
                break;
            }
            for (int j = 0; j < n; j++) {
                arr[i][j] = data.charAt(j);
                if(!isPigLatin(arr, n)) {
                    System.out.println("Wrong input: the letters must be from " + "A to " + (char)('A' + n - 1) );
                    return; // if not a pig latin, then stop the execution
                }
            }
        }
        /**
         * If pig latin
         * print the array if you want with the code below
         */
        /*System.out.println("\nThe array is:\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }*/
        System.out.println("The input array is a latin square");
    }

    public static boolean isPigLatin(char[][]arr,int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] > 'A' + n - 1 ) {
                    return false;
                }
            }
        }
        return true;
    }
    
}
