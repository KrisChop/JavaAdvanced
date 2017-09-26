package StringProcessingLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseTags03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String upcase = "<upcase>";
        String upcaseClose = "</upcase>";

        while (input.contains(upcase)){

            int indexUp = input.indexOf(upcase);
            int indexClose = input.indexOf(upcaseClose);

            String upper = input.substring(indexUp + upcase.length() , indexClose);
            input = input.replace(upcase+ upper + upcaseClose , upper.toUpperCase());
        }
        System.out.println(input);
    }
}
