import java.util.Scanner;

/**
 * ConnectFour
 */
public class ConnectFour {

    public static void main(String[] args) {
        int[][] arr = new int[6][7];
        Scanner kb = new Scanner(System.in);
        int player = 0, col;
        display(arr);
        int row;
        while (true) {
            //c = (player % 2) == 0 ? 'R' : 'Y';
            
            System.out.print("Player " + (player + 1) + " your turn. Give a column:");
            col = kb.nextInt();
            row = findHeight(arr, col);
            if(row == arr[0].length) break;

            fillArray(arr, col, player + 1);
            display(arr);
            
            if(checkRow(arr, row, col, player + 1) ||checkCol(arr, row, col, player + 1)) { //  || checkDiag(arr, row, col, player + 1)
                System.out.println("Player-" + player + 1 + " has won the game!");
                break;
            }

            player = (player + 1) % 2;
        }

    }

    public static int findHeight(int[][] arr, int col){
        int i;
        for (i = 0; i < arr.length; i++) {
            if(arr[i][col] != 0 ) return i;
        }
        return arr.length - 1;
    }

    public static void fillArray(int[][] arr, int col, int n) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i][col] != 0) continue;
            arr[i][col] = n;
            break;
        }
    }

    public static boolean checkRow(int[][] arr, int row, int col, int player) {
        int count = 0;
        for (int j = 0; j < 4 ; j++) {
            if(arr[row][col + j] == player) ++count;
            if(count == 4) return true;
        }
        return false;
    }

    public static boolean checkCol(int[][] arr, int row, int col, int player) {
        int count = 0;
        for (int i = arr.length - 1; i >= 0 ; i--) {
            if(arr[i][col] == player) ++count;
            if(count == 4) return true;
        }
        return false;
    }

    /*public static boolean checkDiag(int[][] arr, int row, int col, int player) {
        int count = 0;
        for (int i = row, j = col; i < arr.length && j < col + (arr.length - row); i++, j++) {
            if(arr[i][j] == player) ++count;
            if(count == 4) return true;
        }

        count = 0;
        for (int i = row, j = col; i < arr.length && j < col + (arr.length - row); i++, j--) {
            if(arr[i][j] == player) ++count;
            if(count == 4) return true;
        }

        return false;
    }*/

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 1) {
                    System.out.print("|R");    
                } else if(arr[i][j] == 2){
                    System.out.print("|Y");
                } else {
                    System.out.print("| ");
                }
            }
            System.out.print("|\n");
        }
    }
}