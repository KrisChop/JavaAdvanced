package AbstractionEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FillTheMatrix01 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[]n = reader.readLine().split(", ");
        int size = Integer.parseInt(n[0]);
        String pattern = n[1];
        int[][] matrix = new int[size][size];

        if (pattern.equals("A")){
            patternA(reader,matrix);
            printMatrix(matrix);
        }else{
            patternB(reader,matrix);
            printMatrix(matrix);
        }


    }

    private static void patternB(BufferedReader reader, int[][] matrix) {
        int firstNum = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 != 0){
                for (int row = matrix[col].length - 1; row >= 0; row--) {
                    matrix[row][col] = firstNum;
                    firstNum++;
                }

            }else {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = firstNum;
                    firstNum++;
                }
            }

        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
    }

    private static void patternA(BufferedReader reader,int[][] matrix) throws IOException {
        int firstNum = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix[col].length; row++) {
                matrix[row][col] = firstNum;
                firstNum++;
            }
        }
    }
}
