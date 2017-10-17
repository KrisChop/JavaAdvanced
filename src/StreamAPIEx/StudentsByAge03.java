package StreamAPIEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StudentsByAge03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> students = new ArrayList<>();

        while (true){
            String [] input = reader.readLine().split("\\s+");
            if ("END".equals(input[0])){
                break;
            }
            int age = Integer.parseInt(input[2]);
            if (age >= 18 && age <= 24){
                students.add(input[0] + " " + input[1] + " " + age);
            }
        }
        students.forEach(System.out::println);
    }
}
