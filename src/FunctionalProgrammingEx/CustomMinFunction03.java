package FunctionalProgrammingEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

public class CustomMinFunction03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        Function<int[], Integer> findSmallest = getMinNumber -> {
            int minNumber = Integer.MAX_VALUE;

            for (Integer number : numbers) {
                if (minNumber > number){
                    minNumber = number;
                }
            }
            return minNumber;
        };
        System.out.println(findSmallest.apply(numbers));
    }
}
