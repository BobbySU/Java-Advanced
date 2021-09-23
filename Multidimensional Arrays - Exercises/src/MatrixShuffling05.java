import java.util.Scanner;

public class MatrixShuffling05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        String[][] matrix = new String[row][col];
        readMatrix(scan, matrix);

        String[] command = scan.nextLine().split("\\s+");
        while (!command[0].equals("END")) {
            if (check(row, col, command)) {
                //swap 0 0 1 1
                String swapElement = matrix[Integer.parseInt(command[1])][Integer.parseInt(command[2])];
                matrix[Integer.parseInt(command[1])][Integer.parseInt(command[2])] =
                        matrix[Integer.parseInt(command[3])][Integer.parseInt(command[4])];
                matrix[Integer.parseInt(command[3])][Integer.parseInt(command[4])] =
                        swapElement;
                printMatrix(matrix);
            } else {
                System.out.println("Invalid input!");
            }
            command = scan.nextLine().split("\\s+");
        }
    }

    private static boolean check(int row, int col, String[] command) {
        if (!command[0].equals("swap")) {
            return false;
        }
        if (command.length != 5) {
            return false;
        }
        int r1 = Integer.parseInt(command[1]);
        int c1 = Integer.parseInt(command[2]);
        int r2 = Integer.parseInt(command[3]);
        int c2 = Integer.parseInt(command[4]);
        if (r1 < 0 || r1 >= row || r2 < 0
                || r2 >= row || c1 < 0 || c1 >= col
                || c2 < 0 || c2 > col) {
            return false;
        }
        return true;
    }


    private static void readMatrix(Scanner scan, String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scan.nextLine().split("\\s+");
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
