package StreamAPILab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TakeTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[]input = reader.readLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        numbers.stream().filter(n -> 10 <= n && n<= 20).distinct().limit(2).forEach(n -> System.out.print(n + " "));

    }
}
