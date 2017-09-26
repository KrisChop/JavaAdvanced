package AbstractionLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumMatrixElements03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] size = reader.readLine().split(", ");
        int[][] matrix = new int[Integer.parseInt(size[0])][Integer.parseInt(size[1])];
        fillMatrix(reader , matrix);
        System.out.println(Integer.parseInt(size[0]));
        System.out.println(Integer.parseInt(size[1]));
        System.out.println(sumMatrix(matrix));
    }

    private static int sumMatrix(int[][] matrix) {
        int rowTotal = 0;
        int result = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            rowTotal = 0;
            for (int j = 0; j < matrix[i].length; j++)
            {
                rowTotal += matrix[i][j];
            }
            result+=rowTotal;
        }

        return result;
    }

    private static void fillMatrix(BufferedReader reader, int[][] matrix) throws IOException {
        for (int row = 0; row < matrix.length; row++) {
            String[] remainders = reader.readLine().split(", ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(remainders[col]);
            }
        }
    }
}
