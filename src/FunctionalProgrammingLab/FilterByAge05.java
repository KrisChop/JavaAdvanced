package FunctionalProgrammingLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        LinkedHashMap<String, Integer> people = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(", ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            people.put(name,age);
        }
        String condition = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        String format  = reader.readLine();

        Predicate<Integer> tester = createTester(condition, age);

        Consumer<Map.Entry<String, Integer>> printer = createPrinter(format);

        printFilteredStudents(people, tester, printer);
    }

    private static void printFilteredStudents(LinkedHashMap<String, Integer> people, Predicate<Integer> tester, Consumer<Map.Entry<String, Integer>> printer) {
        for (Map.Entry<String, Integer> person : people.entrySet()) {
            if (tester.test(person.getValue())) {
                printer.accept(person);
            }
        }
    }

    private static Consumer<Map.Entry<String, Integer>> createPrinter(String format) {
        switch (format) {
            case "name":
                return person -> System.out.printf("%s%n", person.getKey());
            case "age":
                return person -> System.out.printf("%d%n", person.getValue());
            case "name age":
                return person -> System.out.printf("%s - %d%n", person.getKey(), person.getValue());
            default:
                return null;
        }
    }

    private static Predicate<Integer> createTester(String condition, int age) {
        switch (condition) {
            case "younger":
                return x -> x <= age;
            case "older":
                return x -> x >= age;
            default:
                return null;
        }
    }
}
