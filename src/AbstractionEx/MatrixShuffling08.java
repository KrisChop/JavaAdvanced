package AbstractionEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixShuffling08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] input = reader.readLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        String[][] matrix = new String[rows][cols];
        fillMatrix(reader,matrix);

        String command = reader.readLine();
        while (!command.equals("END")){
            String[] commands = command.split(" ");
            String swap = commands[0];
            if (swap.equals("swap") && commands.length == 5){

                int rowCell = Integer.parseInt(commands[1]);
                int colCell = Integer.parseInt(commands[2]);

                int rowSwapCell = Integer.parseInt(commands[3]);
                int colSwapCell = Integer.parseInt(commands[4]);

                if (rowCell >= rows || rowSwapCell >= rows
                        || colCell >= cols || colSwapCell >= cols) {
                    System.out.println("Invalid input!");
                }else {
                    String temp = matrix[rowCell][colCell];
                    matrix[rowCell][colCell] = matrix[rowSwapCell][colSwapCell];
                    matrix[rowSwapCell][colSwapCell] = temp;
                    printMatrix(matrix);
                }

            }else {
                System.out.println("Invalid input!");
            }

            command = reader.readLine();
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
    private static void fillMatrix(BufferedReader reader, String[][] matrix) throws IOException {
        for (int row = 0; row < matrix.length; row++) {
            String[] remainders = reader.readLine().split(" ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = remainders[col];
            }
        }
    }
}
