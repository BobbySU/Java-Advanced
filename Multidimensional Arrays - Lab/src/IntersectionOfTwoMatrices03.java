import java.util.Scanner;

public class IntersectionOfTwoMatrices03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row = Integer.parseInt(scan.nextLine());
        int col = Integer.parseInt(scan.nextLine());
        char[][] first = readMatrix(row, col, scan);
        char[][] second = readMatrix(row, col, scan);
        char[][] matrix = new char[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = first[i][j] == second[i][j] ? first[i][j] : '*';
            }
        }
        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static char[][] readMatrix(int rows, int cols, Scanner scan) {
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] elem = scan.nextLine().split("\\s+");
            for (int i = 0; i < elem.length; i++) {
                char curnt = elem[i].charAt(0);
                matrix[row][i] = curnt;
            }
        }
        return matrix;
    }
}
