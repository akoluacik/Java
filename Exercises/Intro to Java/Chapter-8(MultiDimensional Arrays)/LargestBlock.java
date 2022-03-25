import java.util.Scanner;

public class LargestBlock {
    public static void main(String[] args) {
        int[][] arr = createArray();
        int row, col;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                
            }
        }
    }

    // find consequtive ones in a row, return the occurence from a method
    // by using this value, iterate the matrix


    public static int[][] createArray() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix:");
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        return arr;
    }

    public static boolean checkRow(int[][] arr, int row) {
        for (int i = 0; i < arr[0].length; i++) {
            if(arr[row][i] == 0) return false;
        }
        return true;
    }

    public static boolean checkCol(int[][] arr, int col) {
        for (int i = 0; i < arr[0].length; i++) {
            if(arr[i][col] == 0) return false;
        }
        return true;
    }

}
