package FunctionalProgrammingLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class AddVAT04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       double[] numbers = Arrays.stream(reader.readLine().split(", "))
                       .mapToDouble(Double::parseDouble)
                       .toArray();

        UnaryOperator<Double> addVat = number->number* 1.2;
        System.out.println("Prices with VAT:");
        for (Double number : numbers) {
            System.out.println(String.format("%1$.2f", addVat.apply(number)).replace(".",","));
        }
    }
}
