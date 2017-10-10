package DataRepresentationAndDataManipulationLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursiveFactorial04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        int factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
