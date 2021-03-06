package FunctionalProgrammingLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortEvenNumbers01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> input = Arrays.stream(reader.readLine().split(", "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
        input.removeIf(n -> n % 2 != 0);
        System.out.println(Arrays.toString(input.toArray()).replace("[","").replace("]",""));
        input.sort(Integer::compareTo);
        System.out.println(Arrays.toString(input.toArray()).replace("[","").replace("]",""));
    }
}
