package FunctionalProgrammingEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateParty11 {
    private static Predicate<String> currentPredicate;
    private static List<String> list;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        list = new ArrayList<String>(Arrays.asList(reader.readLine().split("\\s+")));


        while (true){
            String [] tokens = reader.readLine().split("\\s+");
            String command = tokens[0];
            if ("Party!".equals(command)){
                break;
            }
            Predicate<String> lengthPredicate = (string) -> string.length() == Integer.parseInt(tokens[2]);
            Predicate<String> startsWithPredicate = (string) -> string.startsWith(tokens[2]);
            Predicate<String> endsWithPredicate = (string) -> string.endsWith(tokens[2]);

            switch (tokens[1]){
                case "Length":
                    currentPredicate = lengthPredicate;
                    break;
                case "StartsWith":
                    currentPredicate = startsWithPredicate;
                    break;
                case "EndsWith":
                    currentPredicate = endsWithPredicate;
                    break;
            }

            switch (tokens[0]){
                case "Remove":
                    list.removeIf(currentPredicate);
                    break;
                case "Double":
                    doubleArray();
                    break;
            }

        }
        if (list.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.println(Arrays.toString(list.toArray()).replace("]", "").replace("[", "") + " are going to the party!");
        }
    }

    private static void doubleArray() {
        List<String> result = new ArrayList<>();
        for (String s3 : list) {
            if (currentPredicate.test(s3)) {
                result.add(s3);
            }
            result.add(s3);
        }
        list = result;
    }
}
