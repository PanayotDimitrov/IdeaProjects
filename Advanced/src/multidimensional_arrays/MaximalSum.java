package multidimensional_arrays;
import java.util.Scanner;


public class MaximalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the dimensions of the matrix
        int N = input.nextInt();
        int M = input.nextInt();

        // Read the matrix
        int[][] matrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Initialize variables to keep track of the maximum sum and the coordinates of the top-left corner
        int maxSum = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;

        // Find the square with the maximal sum
        for (int i = 0; i <= N - 3; i++) {
            for (int j = 0; j <= M - 3; j++) {
                int squareSum = 0;
                for (int row = i; row < i + 3; row++) {
                    for (int col = j; col < j + 3; col++) {
                        squareSum += matrix[row][col];
                    }
                }
                if (squareSum > maxSum) {
                    maxSum = squareSum;
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
// Print the sum of the elements in the square
        System.out.println("Sum = " + maxSum);

        // Print the 3x3 square with the maximal sum
        for (int i = maxRow; i < maxRow + 3; i++) {
            for (int j = maxCol; j < maxCol + 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        input.close();
    }
}
