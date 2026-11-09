
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
        for (int row = 0; row < n; row++) {
            matrix[row][row] = 0;
            matrix[row][n - 1 - row] = 0;
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (col > 0) {
                    System.out.print(" ");
                }
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}

