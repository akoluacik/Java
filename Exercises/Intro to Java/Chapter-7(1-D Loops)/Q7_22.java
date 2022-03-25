/**
 * Q7_22
 */
public class Q7_22 {

    public static void main(String[] args) {
        int[][] board = {
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0}
        };
        putQueen(board, 0);
    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");       
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] board, int row, int col) {
        for (int i = 0; i < row; i++) { // check row
            if(board[row][i] == 1) return false;
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 1) return false;
        }
        for (int i = row, j = col; i >= 0 && j < 8; i--, j++) {
            if(board[i][j] == 1) return false;
        }
        return true;
    }

    public static void putQueen(int[][] board, int row) {
        if( row == 8 ) {
            printBoard(board);
            return;
        }

        for (int i = 0; i < 8; i++) {
            if(isSafe(board, row, i)) {
                board[row][i] = 1;
                putQueen(board, row + 1);
                board[row][i] = 0;
            }
        }
    }
}