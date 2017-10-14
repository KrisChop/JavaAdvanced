package DataRepresentationAndDataManipulationEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheMissingNumber07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<Integer> numbers = Arrays.stream(reader.readLine().split(", "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
        for (int i = 1; i <= n; i++) {
            if (!numbers.contains(i)){
                System.out.println(i);
            }
        }
    }
}
