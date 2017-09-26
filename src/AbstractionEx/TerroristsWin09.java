package AbstractionEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TerroristsWin09 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        char[] result = input.toCharArray();

        int tempIndex = 0;

        while (input.indexOf('|', tempIndex) != -1) {

            int startIndex = input.indexOf('|', tempIndex);
            int endIndex = input.indexOf('|', startIndex + 1);
            char[] bombArray = input.substring(startIndex + 1, endIndex).toCharArray();

            int sum = 0;

            for (char c : bombArray) {
                sum += c;
            }

            int bombPower = sum % 10;

            int destroyedCharsLeftEdge = Math.max(0, startIndex - bombPower);
            int destroyedCharsRightEdge = Math.min(input.length() - 1, endIndex + bombPower);

            for (int i = destroyedCharsLeftEdge; i <= destroyedCharsRightEdge; i++) {
                result[i] = '.';
            }

            tempIndex = endIndex + 1;
        }

        System.out.println(result);
    }
}
