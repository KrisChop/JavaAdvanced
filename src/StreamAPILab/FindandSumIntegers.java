package StreamAPILab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class FindandSumIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> input = Arrays.asList(reader.readLine().split("\\s+"));

       OptionalInt sum = input.stream()
                .filter(x-> isNumber(x))
                .mapToInt(x->Integer.parseInt(x))
                .reduce((x,y)-> x+y);

        if (sum.isPresent()){
            System.out.println(sum.getAsInt());
        }else {
            System.out.println("No match");
        }
    }

        private static boolean isNumber(String string) {
            if (string.isEmpty()){
                return false;
            }

            char[] character = string.toCharArray();

            for (int i = 0; i < character.length; i++) {

                if (i == 0) {
                    if (character[i] == '-' || character[i] == '+') {
                        continue;
                    }
                }
                    if (!Character.isDigit(character[i])){
                        return false;
                    }

            }

            return true;
    }
}

