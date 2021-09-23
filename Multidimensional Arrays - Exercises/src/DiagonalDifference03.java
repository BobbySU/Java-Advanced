import java.util.Scanner;

public class DiagonalDifference03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] matrix = new int[n][n];

        readMatrix(scan, matrix);

        int absSum = readMatrixDiagonals(matrix);
        System.out.println(absSum);
    }

    private static int readMatrixDiagonals(int[][] matrix) {
        int sumDiagonalA = 0;
        int sumDiagonalB = 0;
        int r = 0, c = 0;
        while (r < matrix.length && c < matrix[r].length) {
            sumDiagonalA += matrix[r][c];
            r++;
            c++;
        }
        System.out.println();
        r = matrix.length - 1;
        c = 0;
        while (r >= 0 && c < matrix[r].length) {
            sumDiagonalB += matrix[r][c];
            r--;
            c++;
        }
        return Math.abs(sumDiagonalA - sumDiagonalB);
    }

    private static void readMatrix(Scanner scan, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
