package StreamAPILab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public class FirstName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> names = Arrays.asList(reader.readLine().split(" "));
        String[] letters = reader.readLine().split(" ");

        HashSet<Character> letter = new HashSet<>();
        Arrays.stream(letters).map(x->x.toUpperCase().charAt(0)).forEach(c->letter.add(c));
        Optional<String> firstName = names.stream().filter(x-> letter.contains(x.charAt(0))).sorted().findFirst();

        if (firstName.isPresent()){
            System.out.println(firstName.get());
        }else {
            System.out.println("No match");
        }
    }
}
