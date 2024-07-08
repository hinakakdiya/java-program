import java.util.*;

public class sudoku1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[][] = new int[10][10];
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print("a[" + i + "][" + j + "]:");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("<-------sudoku------->");
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        if (isValidSudoku(a)) {
            System.out.println("Sudoku is valid");
        } else {
            System.out.println("Sudoku is not valid");
        }
    }

    private static boolean isValidSudoku(int[][] a) {
        for (int i = 1; i <= 9; i++) {
            Set<Integer> rowSet = new HashSet<>();
            Set<Integer> colSet = new HashSet<>();
            for (int j = 1; j <= 9; j++) {
                if (!rowSet.add(a[i][j]) || !colSet.add(a[j][i])) {
                    return false;
                }
            }
        }
        for (int i = 1; i <= 9; i += 3) {
            for (int j = 1; j <= 9; j += 3) {
                if (!isValidSubgrid(a, i, j)) {
                    return false;
                }

            }
        }
        return true;
    }

    private static boolean isValidSubgrid(int[][] sudoku, int startRow, int startCol) {
        Set<Integer> subgridSet = new HashSet<>();
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (!subgridSet.add(sudoku[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }
}
