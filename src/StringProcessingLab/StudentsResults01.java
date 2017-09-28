package StringProcessingLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StudentsResults01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, List<Double>> students = new TreeMap<>();
        double avg = 0.0;
        String[] student = reader.readLine().split("-");
        String name = student[0];
        String[] numbers = student[1].split(", ");

        List<Double> results = new ArrayList<>();

        for (String number : numbers) {
            results.add(Double.parseDouble(number));
            avg += Double.parseDouble(number);
        }

        avg = avg / numbers.length;
        results.add(avg);

        students.put(name, results);

        System.out.println(String.format("%-10s|%7s|%7s|%7s|%7s|",
                "Name", "JAdv", "JavaOOP", "AdvOOP", "Average"));

        for (String student2 : students.keySet()) {
            List<Double> results2 = students.get(student2);

            System.out.println(String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|", student2,
                    results2.get(0), results2.get(1), results2.get(2), results2.get(3)));
        }
    }
}
