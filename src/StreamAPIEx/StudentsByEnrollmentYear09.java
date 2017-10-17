package StreamAPIEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class StudentsByEnrollmentYear09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashSet<String> students = new LinkedHashSet<>();

        while (true){
            String input = reader.readLine();
            if("END".equals(input)){
                break;
            }
            students.add(input);
        }
        students.stream().filter(a -> a.split(" ")[0].endsWith("14") || a.split(" ")[0].endsWith("15"))
                .forEach(student -> System.out.println(student.split("[0-9]{3} ")[1]));
    }
}
