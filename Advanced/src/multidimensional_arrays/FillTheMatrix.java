package multidimensional_arrays;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Filling a matrix regularly (top to bottom and left to right) is boring.
//        Write two methods that fill a size N x N matrix in two different patterns.
//                Both patterns are described below:

        //  3, A/B        1 4 7
        //              2 5 8
        //              3 6 9

        String[] tokens = scanner.nextLine().split(", ");
        int n = Integer.parseInt(tokens[0]);
        String pattern = tokens[1];

        int[][] matrix = new int[n][n];

        switch (pattern) {

            case "A":

                FillMatrixA(matrix);

                break;

            case "B":

                FillMatrixB(matrix);

                break;

        }
        printMatrix(matrix);


    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void FillMatrixA(int[][] matrix) {
        int count = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[col][row] = count;
                count++;
            }
            
        }

    }

    public static void FillMatrixB(int[][] matrix) {
        int count = 1;
        for (int row = 0; row < matrix.length; row++) {
            if((row+1) % 2 != 0){
                for (int col = 0; col < matrix[row].length; col++) {
                    matrix[col][row] = count;
                    count++;
                }
            }else{
                for (int col = matrix[row].length - 1; col >= 0 ; col--) {
                    matrix[col][row] = count;
                    count++;
                }

            }


        }

    }
}
