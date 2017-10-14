package FunctionalProgrammingEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class ConsumerPrint01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] words = reader.readLine().split("\\s+");
        Consumer<String> output = x -> System.out.println(x);

        for (String word : words) {
            output.accept(word);
        }
    }
}
