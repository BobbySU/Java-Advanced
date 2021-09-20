import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = Integer.parseInt(scan.nextLine().split("\\s+")[0]);
        int[][] matrix = readMatrix(row, scan);
        int n = Integer.parseInt(scan.nextLine());

        boolean isFound = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == n) {
                    System.out.println(i + " " + j);
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("not found");
        }
    }

    private static int[][] readMatrix(int rows, Scanner scan) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }
}
