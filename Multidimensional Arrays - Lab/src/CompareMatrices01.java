import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row = Integer.parseInt(scan.nextLine().split("\\s+")[0]);
        int[][] first = readMatrix(row, scan);
        row = Integer.parseInt(scan.nextLine().split("\\s+")[0]);
        int[][] second = readMatrix(row, scan);

        boolean areEqual = areEqual(first, second);

        String output = areEqual ? "equal" : "not equal";
        System.out.println(output);
    }

    private static boolean areEqual(int[][] first, int[][] second) {
        if (first.length != second.length) {
            return false;
        }
        for (int i = 0; i < first.length; i++) {
            int[] firstArr = first[i];
            int[] secondArr = second[i];
            if (firstArr.length != secondArr.length) {
                return false;
            }
            for (int j = 0; j < firstArr.length; j++) {
                if (firstArr[j] != secondArr[j]) {
                    return false;
                }
            }
        }
        return true;
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
