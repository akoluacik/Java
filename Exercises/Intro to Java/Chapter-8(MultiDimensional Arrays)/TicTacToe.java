import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        int index = 0;
        char c;
        int p1, p2; // position
        int[][] arr = new int[3][3];
        Scanner keyboard = new Scanner(System.in);
        
        while (true) {
            c = (index % 2 == 0) ? 'x' : 'o';
            System.out.println("Player-" + ((index % 2) + 1) + ", your turn, enter the coordinates:");

            p1 = keyboard.nextInt();
            p2 = keyboard.nextInt();

            while (!isValid(arr, p1, p2)) {
                System.out.println("Wrong place, please try again:");
                p1 = keyboard.nextInt();
                p2 = keyboard.nextInt();
            }
           
            fillTable(arr, c, p1, p2);
            display(arr);            
           
            if(checkCol(arr, p2, (index % 2) + 1) || checkRow(arr, p1, (index % 2) + 1) || checkDiag(arr, (index % 2) + 1)) {
                System.out.println("Player-" + ((index % 2) + 1) + " wins");
                break;
            }

            index++;
            if(index == 9) break;
            

        }
    }

    public static void display(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("----------------");
            for (int j = 0; j < arr.length; j++) {
                
                if(arr[i][j] == 0) System.out.print("| ");
                else if(arr[i][j] == 1) System.out.print("| x ");
                else System.out.print("| o ");
                
            }
            System.out.println();
        }
        System.out.println("----------------");
    }

    public static boolean isValid(int[][] arr, int x, int y) {
        return arr[x][y] == 0;
    }

    public static void fillTable(int[][] arr, char c, int x, int y) {
        if(isValid(arr, x, y)) {
            arr[x][y] = (c == 'x' ? 1:2);
        }
    }

    public static boolean checkRow(int[][] arr, int row, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[row][i] == n) ++count;
        }
        return count == 3;
    }

    public static boolean checkCol(int[][] arr, int col, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][col] == n) ++count;
        }
        return count == 3;
    }

    public static boolean checkDiag(int[][] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if((arr[i][i] == n)) ++count;
        }
        
        if(count == 3) return true;
        count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][2-i] == n) ++count;
        }
        return count == 3;
    }
}
