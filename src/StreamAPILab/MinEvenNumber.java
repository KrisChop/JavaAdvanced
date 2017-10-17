package StreamAPILab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.OptionalDouble;

public class MinEvenNumber {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.ROOT);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> input = Arrays.asList(reader.readLine().split(" "));
        OptionalDouble min = input.stream()
                .filter(x-> !x.isEmpty())
                .mapToDouble(x-> Double.parseDouble(x))
                .filter(x-> x % 2==0)
                .min();

        if (min.isPresent()){
            System.out.printf("%.2f" , min.getAsDouble());
        }else {
            System.out.println("No match");
        }
    }
}
