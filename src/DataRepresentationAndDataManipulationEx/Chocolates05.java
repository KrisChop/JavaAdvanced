package DataRepresentationAndDataManipulationEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Chocolates05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());

        List<Integer> input = Arrays.stream(reader.readLine().split(", "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        int students = Integer.parseInt(reader.readLine());

        input.sort(Integer::compareTo);

        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {

            if (i + students - 1 < input.size()) {
              int min = input.get(i);
              int max = input.get(i + students - 1);

                if (max - min < minDifference) {
                    minDifference = max - min;
                }
            }
        }
        System.out.printf("Min Difference is %s.", minDifference);
    }
}
