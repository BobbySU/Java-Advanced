import java.util.Scanner;

public class FindTheRealQueen07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row = 8;
        int col = 8;
        char[][] matrix = readMatrix(row, col, scan, " ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 'q') {
                    if (checkQueenDiagonal(matrix, i, j) && checkQueenLine(matrix, i, j)) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }

    private static boolean checkQueenLine(char[][] matrix, int i, int j) {
        int r = i, c = j + 1;
        while (c < matrix[r].length) {
            if (matrix[r][c] == 'q') {
                return false;
            }
            c++;
        }
        c = j - 1;
        while (c >= 0) {
            if (matrix[r][c] == 'q') {
                return false;
            }
            c--;
        }
        r = i - 1;
        c = j;
        while (r >= 0) {
            if (matrix[r][c] == 'q') {
                return false;
            }
            r--;
        }
        r = i + 1;
        c = j;
        while (r < matrix.length) {
            if (matrix[r][c] == 'q') {
                return false;
            }
            r++;
        }
        return true;
    }

    private static boolean checkQueenDiagonal(char[][] matrix, int i, int j) {
        int r = i + 1, c = j + 1;
        while (r < matrix.length && c < matrix[r].length) {
            if (matrix[r][c] == 'q') {
                return false;
            }
            r++;
            c++;
        }
        r = i - 1;
        c = j + 1;
        while (r >= 0 && c < matrix[r].length) {
            if (matrix[r][c] == 'q') {
                return false;
            }
            r--;
            c++;
        }
        r = i - 1;
        c = j - 1;
        while (r >= 0 && c >= 0) {
            if (matrix[r][c] == 'q') {
                return false;
            }
            r--;
            c--;
        }
        r = i + 1;
        c = j - 1;
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == 'q') {
                return false;
            }
            r++;
            c--;
        }
        return true;
    }

    private static char[][] readMatrix(int rows, int cols, Scanner scan, String split) {
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] elem = scan.nextLine().split(split);
            for (int i = 0; i < elem.length; i++) {
                char curnt = elem[i].charAt(0);
                matrix[row][i] = curnt;
            }
        }
        return matrix;
    }
}
