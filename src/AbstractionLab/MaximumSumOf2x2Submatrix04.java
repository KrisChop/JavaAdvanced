package AbstractionLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaximumSumOf2x2Submatrix04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(reader.readLine().split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int rows = input[0];
        int cols = input[1];
        int[][] matrix = new int[rows][cols];
        fillMatrix(reader,matrix);
        int maxSum = Integer.MIN_VALUE;
        int rowIndex = 0;
        int colIndex = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                int sum = matrix[i][j] + matrix[i][j+1]
                        + matrix[i+1][j] + matrix[i+1][j+1];

                if (maxSum < sum){
                    maxSum = sum;
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }
        System.out.println(matrix[rowIndex][colIndex] + " " + matrix[rowIndex][colIndex + 1]);
        System.out.println(matrix[rowIndex + 1][colIndex] + " " + matrix[rowIndex + 1][colIndex + 1]);
        System.out.println(maxSum);
    }
    private static void fillMatrix(BufferedReader reader,int[][] matrix) throws IOException {
        for (int row = 0; row < matrix.length; row++) {
            String[] remainders = reader.readLine().split(", ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(remainders[col]);
            }
        }
    }
}
