package FunctionalProgrammingEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AppliedArithmetics05 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        while (true) {
            String commands = reader.readLine();
            if ("end".equals(commands)) {
                break;
            }
            switch (commands) {
                case "add": numbers = Arrays.stream(numbers).map(x -> x + 1).toArray();break;
                case "multiply": numbers = Arrays.stream(numbers).map(x -> x * 2).toArray();break;
                case "subtract": numbers = Arrays.stream(numbers).map(x -> x - 1).toArray();break;
                case "print":System.out.println(Arrays.toString(numbers).replace("]","").replace("[","").replace(",",""));break;
            }
        }
    }
}