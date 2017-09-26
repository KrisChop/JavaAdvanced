package AbstractionEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaximalSum05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(reader.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int rows = input[0];
        int cols = input[1];
        int[][]matrix = new int[rows][cols];
        fillMatrix(reader,matrix);
        getMaxSumOfMatrix(matrix);
    }

    private static void getMaxSumOfMatrix(int[][] matrix) {

        int maxSum = Integer.MIN_VALUE;
        int rowIndex = 0;
        int colIndex = 0;
        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                int sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]
                        + matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2]
                        + matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];

                if (maxSum < sum) {
                    maxSum = sum;
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }

        System.out.printf("Sum = %s\n",maxSum);
        System.out.println(matrix[rowIndex][colIndex] + " " + matrix[rowIndex][colIndex + 1] + " " + matrix[rowIndex][colIndex + 2]);
        System.out.println(matrix[rowIndex + 1][colIndex] + " " + matrix[rowIndex + 1][colIndex + 1] + " " + matrix[rowIndex + 1][colIndex + 2]);
        System.out.println(matrix[rowIndex + 2][colIndex] + " " + matrix[rowIndex + 2][colIndex + 1] + " " + matrix[rowIndex + 2][colIndex + 2]);
    }

    private static void fillMatrix(BufferedReader reader,int[][] matrix) throws IOException {
        for (int row = 0; row < matrix.length; row++) {
            String[] remainders = reader.readLine().split(" ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(remainders[col]);
            }
        }
    }
}
