import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row = Integer.parseInt(scan.nextLine());
        int[][] matrix = readMatrix(row, scan, " ");
        printMatrixDiagonals(matrix);
    }

    private static void printMatrixDiagonals(int[][] matrix) {
        int r = 0, c = 0;
        while (r < matrix.length && c < matrix[r].length) {
            System.out.print(matrix[r][c] + " ");
            r++;
            c++;
        }
        System.out.println();
        r = matrix.length - 1;
        c = 0;
        while (r >= 0 && c < matrix[r].length) {
            System.out.print(matrix[r][c] + " ");
            r--;
            c++;
        }
    }

    private static int[][] readMatrix(int rows, Scanner scan, String split) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scan.nextLine().split(split))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }
}
