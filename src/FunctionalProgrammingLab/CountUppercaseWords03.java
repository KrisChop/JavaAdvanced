package FunctionalProgrammingLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountUppercaseWords03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        List<String> result = new ArrayList<>();
        int counter = 0;

        for (String s : input) {
            if (s.charAt(0) == s.toUpperCase().charAt(0)){
                result.add(s);
                counter++;
            }
        }
        System.out.println(counter);
        for (String word : result) {
            System.out.println(word);
        }
    }
}
