import java.util.Scanner;

public class MatrixOfPalindromes02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        String[][] matrix = new String[Integer.parseInt(input[0])][Integer.parseInt(input[1])];

        char letter = 'a';
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String palindrome = "" + letter + (char) (letter + j) + letter;
                matrix[i][j] = palindrome;
            }
            letter = (char) (letter + 1);
        }
        printMatrix(matrix);
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
