import java.util.Scanner;

public class CheckSudokuSolution {
    
    public static void main(String[] args) {
        int[][] grid = readASolution();
        System.out.println((isValid(grid) ? "" : "In") + "Valid solution");

    }

    public static int[][] readASolution() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = keyboard.nextInt();
            }
        }
        return grid;
    }

    public static boolean isValid(int[][] grid ) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                /*if( !checkRow(grid, i) && !checkCol(grid, j) && 
                    !checkGrid(grid, i, j) && !isUnique(grid, i, j)) return false;*/
                System.out.println(!isUnique(grid, i, j));
            }
        }
        return true;
    }

    public static boolean checkRow( int[][] grid, int row ) {

        for (int i = 0; i < 9; i++) {
            if(grid[row][i] < 1 && grid[row][i] > 9 ) return false;
        }
        return true;
        
    }

    public static boolean checkCol( int[][] grid, int col ) {

        for (int i = 0; i < 9; i++) {
            if(grid[i][col] < 1 && grid[i][col] > 9 ) return false;
        }
        return true;

    }

    public static boolean checkGrid( int[][] grid, int row, int col ) {
        for (int i = (row) / 3; i < (row / 3) * 3; i++) {
            for (int j = (col / 3); j < (j / 3); j++) {
                if( grid[i][j] < 1 && grid[i][j] > 9 && 
                    grid[row][col] == grid[i][j]) return false;
            }
        }
        return true;
    }
    
    public static boolean isUnique( int[][] grid, int row, int col ) {
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if( grid[i][j] == grid[row][col] ) {
                    return false;
                }
            }
        }
        return true;
    }
}