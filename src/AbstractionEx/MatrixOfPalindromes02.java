package AbstractionEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixOfPalindromes02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        String[][] matrix = new String[rows][cols];

        if (rows + cols <= 27){
            getPalindromes(rows, cols, matrix);
            printMatrix(matrix);
        }else {
            System.out.println("ERROR404");
        }
    }

    private static void getPalindromes(int rows, int cols, String[][] matrix) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                StringBuilder sb = new StringBuilder();

                int ch1 = 97 + row;
                int ch2 = 97 + row + col;
                char one = (char) ch1;
                char two = (char) ch2;
                sb.append(one);
                sb.append(two);
                sb.append(one);
                matrix[row][col] = sb.toString();
            }
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
    }
}
