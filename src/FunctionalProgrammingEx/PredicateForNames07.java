package FunctionalProgrammingEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PredicateForNames07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        String [] names = reader.readLine().split("\\s+");

        for (int i = 0; i < names.length; i++) {
            if (names[i].length() <= number){
                System.out.println(names[i]);
            }
        }
    }
}
