package FunctionalProgrammingEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindTheSmallestElement08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (min >= numbers[i]){
                min = numbers[i];
                index = i;
            }
        }

        System.out.println(index);
    }
}
