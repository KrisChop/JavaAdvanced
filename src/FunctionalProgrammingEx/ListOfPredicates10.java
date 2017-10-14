package FunctionalProgrammingEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class ListOfPredicates10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] numbers = Arrays.stream(reader.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        List<Integer> result = new ArrayList<>();

        BiPredicate<Integer, Integer> isDivisible = (x, y) -> x % y == 0;
        BiPredicate<Integer, int[]> isDivisibleByArray = (x, y) -> {
            boolean divisible = true;

            for (int number : y) {
                if (!isDivisible.test(x, number)){
                    divisible = false;
                }
            }
            return divisible;
        };

        for (int i = 1; i <= n; i++) {
            if (isDivisibleByArray.test(i, numbers)) {
                result.add(i);
            }
        }

        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }
}
