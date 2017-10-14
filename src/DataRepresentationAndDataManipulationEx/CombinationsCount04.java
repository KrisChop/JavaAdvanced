package DataRepresentationAndDataManipulationEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CombinationsCount04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());

        long result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * n / i;
            n--;
        }
        System.out.printf("%d",result);
    }
}
