import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row = Integer.parseInt(scan.nextLine());
        int[][] matrix = readMatrix(row, scan, " ");
        int rowNum = scan.nextInt();
        int colNum = scan.nextInt();
        int num = matrix[rowNum][colNum];
        int[][] matrixOutput = new int[row][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != num) {
                    int curunt = matrix[i][j];
                    matrixOutput[i][j] = curunt;
                } else {
                    matrixOutput[i][j] = numSum(matrix, i, j, num);
                }
            }
        }
        printMatrix(matrixOutput);
    }

    private static int numSum(int[][] matrix, int i, int j, int num) {
        int top = 0;
        int bottom = 0;
        int left = 0;
        int right = 0;
        if (i - 1 >= 0) {
            if (matrix[i - 1][j] != num) {
                top = matrix[i - 1][j];
            }
        }
        if (i + 1 < matrix.length) {
            if (matrix[i + 1][j] != num) {
                bottom = matrix[i + 1][j];
            }
        }
        if (j - 1 >= 0) {
            if (matrix[i][j - 1] != num) {
                left = matrix[i][j - 1];
            }
        }
        if (j + 1 < matrix[i].length) {
            if (matrix[i][j + 1] != num) {
                right = matrix[i][j + 1];
            }
        }
        return top + bottom + left + right;
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
