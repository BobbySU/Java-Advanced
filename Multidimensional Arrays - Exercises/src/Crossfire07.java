import java.util.Scanner;

public class Crossfire07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] rowCol = scan.nextLine().split(" ");
        int row = Integer.parseInt(rowCol[0]);
        int col = Integer.parseInt(rowCol[1]);
        int[][] matrix = new int[row][col];
        fillMatrix(matrix);

        String input = scan.nextLine();
        while (!input.equals("Nuke it from orbit")) {
            int r = Integer.parseInt(input.split("\\s+")[0]);
            int c = Integer.parseInt(input.split("\\s+")[1]);
            int interval = Integer.parseInt(input.split("\\s+")[2]);

            for (int rowToRemove = r - interval; rowToRemove <= r + interval; rowToRemove++) {
                if (rowToRemove >= 0 && rowToRemove < row) {
                    if (c >= 0 && c < col) {
                        matrix[rowToRemove][c] = 0;
                    }
                }
            }
            for (int colToRemove = c - interval; colToRemove <= c + interval; colToRemove++) {
                if (colToRemove >= 0 && colToRemove < col) {
                    if (r >= 0 && r < row) {
                        matrix[r][colToRemove] = 0;
                    }
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = matrix[i].length - 1; j > 0; j--) {
                    if (matrix[i][j - 1] == 0) {
                        matrix[i][j - 1] = matrix[i][j];
                        matrix[i][j] = 0;
                    }
                }
            }
            input = scan.nextLine();
        }
        printMatrix(matrix);
    }

    private static void fillMatrix(int[][] matrix) {
        int n = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = n++;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
