package FunctionalProgrammingEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;

public class FindEvensOrOdds04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(reader.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        String word = reader.readLine();

        int startNum = input[0];
        int endNum = input[1];

        Predicate<Integer> evenOrOdd = findNumbers(word);

        for (int i = startNum; i <= endNum; i++) {
            if (evenOrOdd.test(i)){
                System.out.print(i + " ");
            }
        }
    }

    private static Predicate<Integer> findNumbers(String word) {
        switch (word){
            case "even":
                return x -> x % 2 == 0;
            case "odd":
                return x -> x % 2 != 0;
                default:
                    return null;
        }
    }
}
