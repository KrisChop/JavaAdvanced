package StringProcessingEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class MatchPhoneNumber10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        String regex = "^\\+359([ -])2\\1\\d{3}\\1\\d{4}$";

        while (!"end".equals(input)){
            if (Pattern.matches(regex , input)){
                System.out.println(input);
            }

            input = reader.readLine();
        }
    }
}
