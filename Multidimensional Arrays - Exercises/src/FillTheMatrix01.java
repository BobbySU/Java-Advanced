import java.util.Scanner;

public class FillTheMatrix01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        int[][] matrix = new int[n][n];
        if (input[1].equals("A")) {
            readMatrixA(matrix);
        } else {
            readMatrixB(matrix);
        }
        printMatrix(matrix);
    }

    private static void readMatrixB(int[][] matrix) {
        int in = 1;
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 != 0) {
                for (int j = matrix.length - 1; j >= 0; j--) {
                    matrix[j][i] = in++;
                }
            } else {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = in++;
                }
            }
        }
    }

    private static void readMatrixA(int[][] matrix) {
        int in = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = in++;
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
