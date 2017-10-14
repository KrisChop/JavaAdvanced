package FunctionalProgrammingEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class KnightsOfHonor02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] names = reader.readLine().split("\\s+");
        Consumer<String> sirOutput = x -> System.out.println("Sir "+ x);

        for (String name : names) {
            sirOutput.accept(name);
        }
    }
}
