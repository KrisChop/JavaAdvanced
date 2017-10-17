package StreamAPILab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.OptionalDouble;


public class AverageOfDoubles {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.ROOT);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double[] numbers = Arrays.stream(reader.readLine().split("\\s+"))
                        .filter(x -> !x.isEmpty())
                        .mapToDouble(Double::parseDouble)
                        .toArray();
        OptionalDouble optionalDouble = Arrays.stream(numbers).average();

        if (optionalDouble.isPresent()){
            System.out.printf("%.2f" ,optionalDouble.getAsDouble());
        }else {
            System.out.println("No match");
        }
    }
}
