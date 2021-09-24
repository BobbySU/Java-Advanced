import java.util.ArrayList;
import java.util.Scanner;

public class StringMatrixRotation06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int rotation = Integer.parseInt(command.split("[()]+")[1]) % 360;
        ArrayList<String> linesForMatrix = new ArrayList<>();
        int maxLength = 0;

        String input = scan.nextLine();
        while (!input.equals("END")) {
            linesForMatrix.add(input);
            if (input.length() > maxLength) {
                maxLength = input.length();
            }
            input = scan.nextLine();
        }

        int row = linesForMatrix.size();
        int col = maxLength;

        char[][] matrix = new char[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j < linesForMatrix.get(i).length()) {
                    matrix[i][j] = linesForMatrix.get(i).charAt(j);
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }
        rotate(rotation, row, col, matrix);
    }

    private static void rotate(int rotation, int row, int col, char[][] matrix) {
        if (rotation == 90) {
            for (int j = 0; j < col; j++) {
                for (int i = row - 1; i >= 0; i--) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        } else if (rotation == 180) {
            for (int i = row - 1; i >= 0; i--) {
                for (int j = col - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        } else if (rotation == 270) {
            for (int j = col - 1; j >= 0; j--) {
                for (int i = 0; i < row; i++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        }
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
