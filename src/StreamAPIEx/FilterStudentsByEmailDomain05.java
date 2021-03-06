package StreamAPIEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class FilterStudentsByEmailDomain05 {
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
        students.stream().filter(a -> a.split("\\s+")[2].contains("@gmail.com"))
                .forEach(student -> System.out.println(student.split(" ")[0] +" "+ student.split(" ")[1]));
    }
}
