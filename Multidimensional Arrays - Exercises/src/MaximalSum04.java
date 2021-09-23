import java.util.Scanner;

public class MaximalSum04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row = scan.nextInt();
        int col = scan.nextInt();
        int[][] matrix = new int[row][col];
        readMatrix(scan, matrix);

        int[][] max = new int[3][3];
        int maxSum = 0;
        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                if (maxSum < sumOfElements(matrix, i, j)) {
                    maxSum = sumOfElements(matrix, i, j);
                    max = new int[][]{
                            {matrix[i][j], matrix[i][j + 1], matrix[i][j + 2]},
                            {matrix[i + 1][j], matrix[i + 1][j + 1], matrix[i + 1][j + 2]},
                            {matrix[i + 2][j], matrix[i + 2][j + 1], matrix[i + 2][j + 2]},
                    };
                }
            }
        }
        System.out.printf("Sum = %d%n", maxSum);
        printMatrix(max);
    }

    private static int sumOfElements(int[][] matrix, int i, int j) {
        int sumOfElement = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] +
                matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2] +
                matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
        return sumOfElement;
    }

    private static void readMatrix(Scanner scan, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
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
