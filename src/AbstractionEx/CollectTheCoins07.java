package AbstractionEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CollectTheCoins07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[][] matrix = new char[4][];

        for (int row = 0; row < matrix.length; row++) {
            char[] remainders = reader.readLine().toCharArray();
            matrix[row] = new char[remainders.length];
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = remainders[col];
            }
        }
        int coins = 0;
        int wallsHit = 0;

        char [] commands = reader.readLine().toCharArray();

        int currentRow = 0;
        int currentCol = 0;

        for (char command : commands) {
            switch (command){
                case '>':
                    currentCol++;
                    if (currentCol >= matrix[currentRow].length) {
                        currentCol--;
                        wallsHit++;
                    } else if (matrix[currentRow][currentCol] == '$'){
                        coins++;
                    }
                    break;
                case '<':
                    currentCol--;
                    if (currentCol < 0){
                        currentCol++;
                        wallsHit++;
                    }else if (matrix[currentRow][currentCol] == '$'){
                        coins++;
                    }
                    break;
                case '^':
                    currentRow--;
                    if (currentRow < 0){
                        currentRow++;
                        wallsHit++;
                    } else if (matrix[currentRow][currentCol] == '$'){
                        coins++;
                    }
                    break;
                case 'V':
                    currentRow++;
                    if (currentRow > matrix.length - 1
                            || currentCol >= matrix[currentRow].length) {
                        currentRow--;
                        wallsHit++;
                    } else if (matrix[currentRow][currentCol] == '$'){
                        coins++;
                    }
                    break;
            }
        }

        System.out.printf("Coins = %d%n", coins);
        System.out.printf("Walls = %d", wallsHit);
    }
}
