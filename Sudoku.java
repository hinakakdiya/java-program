import java.util.*;

public class Sudoku {

    public static boolean isValidSudoku(int[][] board) {
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = board[i][j];
                if (num != 0) {
                    if (!seen.add(num + " in row " + i) ||
                            !seen.add(num + " in column " + j) ||
                            !seen.add(num + " in subgrid " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] sudokuBoard = new int[9][9];

        System.out.println(
            "Enter the Sudoku board (9 rows, each row containing 9 space-separated digits, use '0' for empty cells):");
            for (int i = 0; i < 9; i++) {
                String[] rowInput = scanner.nextLine().split(" ");
                for (int j = 0; j < 9; j++) {
                    sudokuBoard[i][j] = Integer.parseInt(rowInput[j]);
                }
            }
    
            if (isValidSudoku(sudokuBoard)) {
                System.out.println("The Sudoku puzzle is valid.");
            } else {
                System.out.println("The Sudoku puzzle is not valid.");
            }
    
            scanner.close(); // Close the scanner after use
        }
    }