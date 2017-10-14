package FunctionalProgrammingEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseAndExclude06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> input = Arrays.stream(reader.readLine().split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
        int divisible = Integer.parseInt(reader.readLine());

        input.removeIf(x -> x % divisible == 0);

        for (int i = input.size() - 1; i >= 0 ; i--) {
            System.out.print(input.get(i)+ " ");
        }

    }
}
