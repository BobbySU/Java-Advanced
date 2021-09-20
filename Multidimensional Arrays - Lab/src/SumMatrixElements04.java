import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row = Integer.parseInt(scan.nextLine().split(", ")[0]);
        int[][] matrix = readMatrix(row, scan, ", ");
        System.out.println(row);
        System.out.println(matrix[0].length);
        printMatrixSum(matrix);
    }

    private static void printMatrixSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
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
