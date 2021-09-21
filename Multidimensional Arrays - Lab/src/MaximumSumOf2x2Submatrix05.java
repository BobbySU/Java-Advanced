import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row = Integer.parseInt(scan.nextLine().split(", ")[0]);
        int[][] matrix = readMatrix(row, scan, ", ");
        int[][] max = new int[2][2];
        int maxSum = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (maxSum < matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1]) {
                    maxSum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
                    max = new int[][]{
                            {matrix[i][j], matrix[i][j + 1]},
                            {matrix[i + 1][j], matrix[i + 1][j + 1]}
                    };
                }
            }
        }
        printMatrix(max);
        System.out.println(maxSum);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
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
