import java.util.Scanner;

public class DiagonalDifference03A {
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
        //Formola za Diagonal
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    sumDiagonalA += matrix[i][j];
                }
            }
        }
        //Formola za Obraten Diagonal
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j == matrix.length - i - 1) {
                    sumDiagonalB += matrix[i][j];
                }
            }
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
