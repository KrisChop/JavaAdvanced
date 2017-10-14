package FunctionalProgrammingLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumNumbers02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = Arrays.stream(reader.readLine().split(", "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println("Count = " +numbers.size());
        System.out.println("Sum = " + sum);

    }
}
