package StringProcessingLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class ValidUsernames07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String regex = "^[\\w-]{3,16}$";
        String line = reader.readLine();
        if (line.equals("END")){
            System.out.println("(no output)");
        }

        while (!"END".equals(line)){
            if(Pattern.matches(regex,line)) {
                System.out.println("valid");
            }else{
                System.out.println("invalid");
            }
            line = reader.readLine();
        }
    }
}
